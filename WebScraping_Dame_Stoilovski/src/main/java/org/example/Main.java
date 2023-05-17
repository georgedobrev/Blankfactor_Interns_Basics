package org.example;
import java.sql.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String region = getUserInput();

        try {
            // Set the database path
            String dbPath = System.getProperty("user.dir") + "/covidInfo.db";

            // Create a connection to the database
            Connection connection = null;
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
                // Create the table if it doesn't exist
                createTable(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            scrapingData(connection);

            assert connection != null;

            if (region != null) {
                Extract.ExtractDataToCSV(region, connection);
            }
            else {
                Extract.ExtractDataToCSV(connection);
            }

            connection.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void scrapingData(Connection connection) throws IOException {

        String url = "https://www.worldometers.info/coronavirus/";
        Document doc = Jsoup.connect(url).timeout(6000).get();
        Elements table = doc.select("table[id = main_table_countries_today]");

        for (Element row : table.select("tr:gt(7)")) {

            Elements tds = row.select("td:not([rowspan])");

            String region = row.select("td[style*=display:none]").text();
            String country = tds.get(1).text();

            String totalCases = tds.get(2).text().replace(",", "");

            String totalTests = tds.get(12).text().replace(",", "");

            String activeCases = tds.get(8).text().replace(",", "");

            String insertDataQuery = "INSERT INTO covidInfo (region, country, totalCases, " +
                    "totalTests, activeCases) VALUES (?, ?, ?, ?, ?)";

            try {
                assert connection != null;

                PreparedStatement statement = connection.prepareStatement(insertDataQuery);
                statement.setString(1, region);
                statement.setString(2, country);
                statement.setString(3, totalCases);
                statement.setString(4, totalTests);
                statement.setString(5, activeCases);
                statement.executeUpdate();

            } catch (Exception e) {
                continue;
            }
        }
    }

    static String getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to enter a specific region for exporting data?\n[enter 'y' for yes, 'n' for no]");
        String answer = scanner.nextLine();
        String region = null;

        if (answer.equals("y")) {
            System.out.println("Enter the region: ");
            System.out.println("NOTE: Available regions you can choose from ['Europe', 'Africa', 'Asia', 'North America', 'South America', 'Australia/Oceania']");
            region = scanner.nextLine();
            if (!checkRegion(region)) {
                System.out.println("INVALID REGION: The program will be executed without region.");
                region = null;
            }

        } else if (!answer.equals("n")) {
            System.out.println("You entered wrong character. The program will be executed without specific region.");
        }
        return region;
    }

    static boolean checkRegion(String region) {
        String[] availableRegions = new String[] {"Europe", "Africa", "Asia", "North America", "South America", "Australia/Oceania"};
        for (String reg : availableRegions) {
            if (region.equals(reg)) {
                return true;
            }
        }
        return false;
    }

    static void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String createTableQuery = "CREATE TABLE IF NOT EXISTS covidInfo (region TEXT, country TEXT UNIQUE, " +
                "totalCases TEXT, totalTests TEXT, activeCases TEXT)";
        statement.executeUpdate(createTableQuery);
        System.out.println("Database created successfully.");
    }
}