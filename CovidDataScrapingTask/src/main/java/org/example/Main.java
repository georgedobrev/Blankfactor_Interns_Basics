package org.example;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void createDatabase(String fileName) {
        Path path = Paths.get(fileName);
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();

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

    public static void createTable() {
        Path path = Paths.get("Sqlitecovid.db");
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();

        String sql = "CREATE TABLE IF NOT EXISTS covid (\n"
                + " id integer PRIMARY KEY AUTOINCREMENT,\n"
                + " region text NOT NULL,\n"
                + " country text NOT NULL, \n"
                + " total_cases integer NOT NULL, \n"
                + " total_tests integer NOT NULL, \n"
                + " active_cases integer NOT NULL\n"
                + ");";

        try{
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insert(String region, String country,
                              int totalCases, int totalTests, int activeCases) {
        Path path = Paths.get("Sqlitecovid.db");
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();
        String sql = "INSERT INTO covid(region, country, total_cases, total_tests, active_cases) VALUES(?,?,?,?,?)";

        try{
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, region);
            preparedStatement.setString(2, country);
            preparedStatement.setInt(3, totalCases);
            preparedStatement.setInt(4, totalTests);
            preparedStatement.setInt(5, activeCases);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void select() {
        Path path = Paths.get("Sqlitecovid.db");
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();
        String sql = "SELECT * FROM covid";

        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // loop through the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") +  "\t" +
                        resultSet.getString("name") + "\t" +
                        resultSet.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void selectWithRegion(String regionName) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy_MM_dd");
        String date = localDate.format(dateTimeFormatter);

        Path path = Paths.get("Sqlitecovid.db");
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();
        String csvFile = "export_"+ regionName +"_" + date + ".csv";
        FileWriter writer = null;

        String sql = "select * from covid where region = ?";

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

                System.out.println(id +  "\t" +
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document doc;

        try {
            createDatabase("covid.db");
            createTable();

            doc = Jsoup.connect("https://www.worldometers.info/coronavirus/").get();
            Elements table = doc.select("table[id = main_table_countries_today]");
            Elements rows = table.select("tr:gt(7)");

            for (Element row : rows) {
                Elements tds =  row.select("td:not([rowspan])");
                Element region = row.selectFirst("td[style*=display:none]");

                System.out.println("Entry has been read");

                String regionParsed = region.text().trim();
                String country = tds.get(1).text().trim();
                int totalCases;
                int totalTests;
                int activeCases;

                if (tds.get(2).text().equals("N/A") || tds.get(2).text().equals("")) {
                    totalCases = -1;
                }   else {
                    totalCases = Integer.parseInt(tds.get(2).text().replace(",","").trim());
                }

                if (tds.get(12).text().equals("N/A") || tds.get(12).text().equals("")) {
                    totalTests = -1;
                }   else {
                    totalTests = Integer.parseInt(tds.get(12).text().replace(",","").trim());
                }

                if (tds.get(8).text().equals("N/A") || tds.get(8).text().equals("")) {
                    activeCases = -1;
                }   else {
                    activeCases = Integer.parseInt(tds.get(8).text().replace(",","").trim());
                }

                insert(regionParsed, country, totalCases, totalTests, activeCases);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Do you want to search for the statistics in a specific region? Yes/No");
        String answer = scanner.nextLine();

        switch (answer) {
            case "Yes":
                System.out.println("Please input a region: ");
                String continent = scanner.nextLine();

                if (continent.equals("Europe") || continent.equals("Asia") || continent.equals("North America") ||
                        continent.equals("South America") || continent.equals("Australia/Oceania") || continent.equals("Africa")) {
                    selectWithRegion(continent);
                } else {
                    System.out.println("Not a valid region");
                }
                break;
            case "No":
                select();
                break;
            default:
                System.out.println("Not a proper answer");
        }
    }
}