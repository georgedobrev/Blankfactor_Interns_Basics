package org.example;

import java.io.FileWriter;
import java.sql.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 0 for no parameter or 1 for region parameter: ");
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (input == 0) {
            // Code for no parameter
            System.out.println("No parameter provided.");
        } else if (input == 1) {
            // Code for region parameter
            System.out.print("Enter the region: ");
            String region = scanner.nextLine();

            // Set the database path
            String dbPath = System.getProperty("user.dir") + "/covidData.db";
            // Create a connection to the database
            Connection connection = null;
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
                System.out.println("ok con");
                // Create the table if it doesn't exist
                createTable(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();

            System.out.println("Information is from: " + dtf.format(now));
            String url = "https://www.worldometers.info/coronavirus/";

            assert connection != null;

            Document doc = Jsoup.connect(url).get();
            Elements table = doc.select("table[id=main_table_countries_today]");
            System.out.println();

            for (Element row : table.select("tr:gt(7)")) {
                Elements tds = row.select("td:not([rowspan])");
                String country = tds.get(1).text();
                String totalCases = tds.get(2).text().replace(",", "");
                String totalTests = tds.get(12).text().replace(",", "");
                String activeCases = tds.get(8).text().replace(",", "");

                System.out.println(country + totalCases + totalTests + activeCases);

                String insertDataQuery = "INSERT INTO covidInfo (country, total_cases, " +
                        "total_tests, active_cases) VALUES (?, ?, ?, ?)";

                try (PreparedStatement statement = connection.prepareStatement(insertDataQuery)) {
                    statement.setString(1, country);
                    statement.setString(2, totalCases);
                    statement.setString(3, totalTests);
                    statement.setString(4, activeCases);
                    System.out.println("added data");
                    statement.executeUpdate();
                } catch (Exception e) {
                    continue;
                }
            }

            printFormattedTableForRegion(connection, region);
            exportDataToCSV(connection, region);
        } else {
            System.out.println("Invalid input. Please enter 0 or 1.");
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String createTableQuery = "CREATE TABLE IF NOT EXISTS covidInfo (country TEXT UNIQUE, " +
                "total_cases TEXT, total_tests TEXT, active_cases TEXT)";
        statement.executeUpdate(createTableQuery);
        System.out.println("Database created successfully.");
    }

    private static void printFormattedTableForRegion(Connection connection, String region) throws SQLException {
        String selectDataQuery = "SELECT * FROM covidInfo WHERE region = ?";

        try (PreparedStatement statement = connection
                .prepareStatement(selectDataQuery)) {
            statement.setString(1, region);
            ResultSet resultSet = statement.executeQuery();


            if (resultSet.next()) {
                System.out.println("Formatted Table for Region: " + region);
                System.out.println("Country\t\tTotal Cases\tTotal Tests\tActive Cases");
                System.out.println("-----------------------------------------------------------------");

                do {
                    String country = resultSet.getString("country");
                    String totalCases = resultSet.getString("total_cases");
                    String totalTests = resultSet.getString("total_tests");
                    String activeCases = resultSet.getString("active_cases");

                    System.out.printf("%s\t\t%s\t\t%s\t\t%s%n",
                            country, totalCases, totalTests, activeCases);
                } while (resultSet.next());
            } else {
                System.out.println("No data available for the requested region.");
            }
        }
    }

    private static void exportDataToCSV(Connection connection, String region) throws SQLException, IOException {
        String dbPath = System.getProperty("user.dir") + "/covidData.db";
        String selectDataQuery = "SELECT * FROM covidInfo WHERE region = ?";

        try (PreparedStatement statement = connection.prepareStatement(selectDataQuery)) {
            statement.setString(1, region);
            ResultSet resultSet = statement.executeQuery();

            String fileName = "export_" + region.toLowerCase() + "_" +
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy_MM_dd")) + ".csv";

            try (FileWriter csvWriter = new FileWriter(fileName)) {
                // Write column headers to CSV
                csvWriter.append("Country,Total Cases,Total Tests,Active Cases\n");

                // Write data rows to CSV
                while (resultSet.next()) {
                    String country = resultSet.getString("country");
                    String totalCases = resultSet.getString("total_cases");
                    String totalTests = resultSet.getString("total_tests");
                    String activeCases = resultSet.getString("active_cases");

                    // Write data row to CSV
                    csvWriter.append(country).append(",")
                            .append(totalCases).append(",").append(totalTests).append(",")
                            .append(activeCases).append("\n");
                }

                // Flush and close the FileWriter
                csvWriter.flush();
                csvWriter.close();

                System.out.println("Data exported to CSV successfully. File: " + fileName);
            }
        }
    }
}