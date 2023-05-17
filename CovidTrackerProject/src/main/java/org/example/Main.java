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
    public static void main(String[] args) throws IOException, SQLException {
        emptyTable();
        createDatabase("covid.db");
        createTable();
        Scanner scanner = new Scanner(System.in);

        Document doc = Jsoup.connect("https://www.worldometers.info/coronavirus/").get();
        Element table = doc.select("table#main_table_countries_today").first();
        Elements rows = table.select("tbody tr:not(.row_continent)");

        Elements dataRows = rows.not(":first-child");

        for (Element row : dataRows) {
            String region = row.selectFirst("td[style*=display:none]").text();
            String country = row.select("td:nth-child(2)").text();
            String totalCasesStr = row.select("td:nth-child(3)").text();
            int totalCases = parseNumber(totalCasesStr);

            String totalTestsStr = row.select("td:nth-child(13)").text();
            int totalTests = parseNumber(totalTestsStr);

            String activeCasesStr = row.select("td:nth-child(9)").text();
            int activeCases = parseNumber(activeCasesStr);


            insertData(region, country, totalCases, totalTests, activeCases);
        }
        selectData();

        System.out.println("Sort covid data by region? Yes/No");
        String answer = scanner.nextLine();

        switch (answer) {
            case "Yes":
                System.out.println("Enter region: ");
                String region = scanner.nextLine();

                if (region.equals("Europe") || region.equals("Asia") || region.equals("North America") ||
                        region.equals("South America") || region.equals("Australia/Oceania") || region.equals("Africa")) {
                    sortByRegion(region);
                } else {
                    System.out.println("Not a valid region");
                }
                break;
            case "No":
                selectData();
                break;
            default:
                System.out.println("Not a proper answer");
        }

    }
    public static int parseNumber(String numberStr) {
        if (numberStr == null || numberStr.isBlank() || numberStr.equals("N/A")) {
            return -1; // Return a default value to indicate the absence of a valid number
        }
        String cleanNumberStr = numberStr.replace(",", "");
        return Integer.parseInt(cleanNumberStr);
    }
    public static void createDatabase (String name) throws SQLException {
        // Connect to the database
        Path path = Paths.get(name);
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();
        try{
            Connection connection = DriverManager.getConnection(url);
                if(connection != null){
                    System.out.println("Database has been created.");
                }
        } catch ( SQLException e){
            System.out.println(e.getMessage());
        };
    };

    public static void createTable() {
        Path path = Paths.get("covid.db");
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS covid_info (REGION TEXT NOT NULL, COUNTRY TEXT NOT NULL, TOTAL_CASES NUMERIC NOT NULL, TOTAL_TESTS NUMERIC NOT NULL, ACTIVE_CASES NUMERIC NOT NULL)";

        try{
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlCreate);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertData(String region, String country, int totalCases, int totalTests, int activeCases) {
        Path path = Paths.get("covid.db");
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();
        String sql = "INSERT INTO covid_info(region, country, total_cases, total_tests, active_cases) VALUES(?,?,?,?,?)";

        try {
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




    public static void selectData() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy_MM_dd");
        String date = localDate.format(dateTimeFormatter);

        Path path = Paths.get("covid.db");
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();
        String csvFile = "export_all_" + date + ".csv";
        FileWriter writer = null;

        String sql = "SELECT * FROM covid_info";

        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            writer = new FileWriter(csvFile);
            writer.append("REGION, COUNTRY, TOTAL_CASES, TOTAL_TESTS, ACTIVE_CASES");
            writer.append('\n');

            while (resultSet.next()) {
                String region = resultSet.getString("region");
                String country = resultSet.getString("country");
                int totalCases = resultSet.getInt("total_cases");
                int totalTests = resultSet.getInt("total_tests");
                int activeCases = resultSet.getInt("active_cases");

                System.out.println(
                        region + "\t" +
                                country + "\t" +
                                totalCases + "\t" +
                                totalTests + "\t" +
                                activeCases
                );

                writer.append(String.valueOf(region)).append(",")
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
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void sortByRegion(String regionName) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy_MM_dd");
        String date = localDate.format(dateTimeFormatter);

        Path path = Paths.get("covid.db");
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();
        String csvFile = "export_"+ regionName +"_" + date + ".csv";
        FileWriter writer = null;

        String sql = "select * from covid_info where region = ?";

        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, regionName);
            ResultSet resultSet = preparedStatement.executeQuery();
            writer = new FileWriter(csvFile);
            writer.append("REGION, COUNTRY, TOTAL_CASES, TOTAL_TESTS, ACTIVE_CASES");
            writer.append('\n');

            while (resultSet.next()) {

                String region = resultSet.getString("region");
                String country = resultSet.getString("country");
                int totalCases = resultSet.getInt("total_cases");
                int totalTests = resultSet.getInt("total_tests");
                int activeCases = resultSet.getInt("active_cases");

                System.out.println(
                        region + "\t" +
                        country + "\t" +
                        totalCases + "\t" +
                        totalTests + "\t" +
                        activeCases);

                writer.append(String.valueOf(region)).append(",")
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
    public static void emptyTable() {
        Path path = Paths.get("covid.db");
        String url = "jdbc:sqlite:" + path.toAbsolutePath().toString();
        String deleteQuery = "DELETE FROM covid_info";

        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            statement.executeUpdate(deleteQuery);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
