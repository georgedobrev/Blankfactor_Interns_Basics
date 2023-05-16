import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    
    public static void main(String[] args) {
        createTable();
        handleUserInput();
    }

    public static void createDatabase(String fileName) {
        Path path = Paths.get(fileName);
        String url = "jdbc:sqlite:" + path.toAbsolutePath();

        try {
            Connection conn = DriverManager.getConnection(url);

            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void createTable() {
        Path path = Paths.get("db_covid_data.sqlite");
        String url = "jdbc:sqlite:" + path.toAbsolutePath();
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement qry = conn.prepareStatement("CREATE TABLE IF NOT EXISTS covid_data ("
                     + "id INTEGER PRIMARY KEY,"
                     + "region text,"
                     + "country text,"
                     + "total_cases STRING,"
                     + "new_cases integer,"
                     + "active_cases integer,"
                     + "total_tests integer"
                     + ")")) {
            qry.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertData(String region, String countryName, int totalCases, int activeCases, int totalTests) {
        Path path = Paths.get("db_covid_data.sqlite");
        String url = "jdbc:sqlite:" + path.toAbsolutePath();
        String sql = "INSERT INTO covid_data(region, country, total_cases, new_cases, active_cases, total_tests) VALUES(?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement qry = conn.prepareStatement(sql)
        ) {
            qry.setString(1, region);
            qry.setString(2, countryName);
            qry.setInt(3, totalCases);
            qry.setInt(4, activeCases);
            qry.setInt(5, totalTests);
            qry.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void select() {
        Path path = Paths.get("db_covid_data.sqlite");
        String url = "jdbc:sqlite:" + path.toAbsolutePath();
        String sql = "SELECT * FROM covid_data";

        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // loop through the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" +
                        resultSet.getString("country") + "\t" +
                        resultSet.getInt("total_cases"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void selectWithRegion(String regionName) {
        Path path = Paths.get("db_covid_data.sqlite");
        String url = "jdbc:sqlite:" + path.toAbsolutePath();
        String csvFile = "export_" + regionName + "_" + LocalDate.now() + ".csv";
        FileWriter writer = null;

        String sql = "SELECT * FROM covid_data WHERE region = ?";

        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, regionName);
            ResultSet resultSet = preparedStatement.executeQuery();
            writer = new FileWriter(csvFile);
            writer.append("Id, Region, Country, TotalCases, TotalTests, ActiveCases");
            writer.append('\n');

            // loop through the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String region = resultSet.getString("region");
                String country = resultSet.getString("country");
                int totalCases = resultSet.getInt("total_cases");
                int totalTests = resultSet.getInt("total_tests");
                int activeCases = resultSet.getInt("active_cases");

                System.out.println(id + "\t" +
                        region + "\t" +
                        country + "\t" +
                        totalCases + "\t" +
                        totalTests + "\t" +
                        activeCases);

                writer.append(String.valueOf(id)).append(",")
                        .append(region).append(",")
                        .append(country).append(",")
                        .append(String.valueOf(totalCases)).append(",")
                        .append(String.valueOf(totalTests)).append(",")
                        .append(String.valueOf(activeCases));

                writer.append('\n');
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        Document doc;

        try {
            createTable();

            doc = Jsoup.connect("https://www.worldometers.info/coronavirus/").get();
            Elements table = doc.select("table[id=main_table_countries_today]");
            Elements rows = table.select("tr:gt(7)");

            for (Element row : rows) {
                Elements tds = row.select("td:not([rowspan])");
                Element region = row.selectFirst("td[style*=display:none]");
                System.out.println("Entry has been read");

                String regionParsed = region.text().trim();
                String country = tds.get(1).text().trim();
                int totalCases;
                int totalTests;
                int activeCases;

                if (tds.get(2).text().equals("N/A") || tds.get(2).text().equals("")) {
                    totalCases = -1;
                } else {
                    totalCases = Integer.parseInt(tds.get(2).text().replace(",", "").trim());
                }

                if (tds.get(12).text().equals("N/A") || tds.get(12).text().equals("")) {
                    totalTests = -1;
                } else {
                    totalTests = Integer.parseInt(tds.get(12).text().replace(",", "").trim());
                }

                if (tds.get(8).text().equals("N/A") || tds.get(8).text().equals("")) {
                    activeCases = -1;
                } else {
                    activeCases = Integer.parseInt(tds.get(8).text().replace(",", "").trim());
                }

                insertData(regionParsed, country, totalCases, totalTests, activeCases);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("To check the latest covid statistics press 1? \n");
        String answer = scanner.nextLine();

        if (answer.equals("1")) {
            System.out.println("Please input a region: ");
            System.out.println("Europe | Asia | North America | South America | Australia/Oceania | Africa: ");

            String continent = scanner.nextLine();

            if (continent.equals("Europe") || continent.equals("Asia") || continent.equals("North America") ||
                    continent.equals("South America") || continent.equals("Australia/Oceania") || continent.equals("Africa")) {
                selectWithRegion(continent);
            } else {
                System.out.println("Not a valid region");
            }
        } else
            {
                System.out.println("Not a proper answer");
            }
        }
}


