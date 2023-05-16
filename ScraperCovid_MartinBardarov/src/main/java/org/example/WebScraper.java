package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WebScraper {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            // Create a connection to the database
            connection = DriverManager.getConnection("jdbc:sqlite:/Users/Martin.Bardarov/Desktop/" +
                    "Java Projects/MavenProject/ScraperCovid/database.db");
            System.out.println("Connected to the database.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a region or continue without one");
            String regionFilter = scanner.nextLine();
            if (!regionFilter.equals("Europe") &&
                    !regionFilter.equals("North America") &&
                    !regionFilter.equals("Asia") &&
                    !regionFilter.equals("South America") &&
                    !regionFilter.equals("Africa") &&
                    regionFilter.equals("")&&
                    !regionFilter.equals("Australia/Oceania")) {
                regionFilter = null;
            }

            if (args.length > 0) {
                String[] parameter = args[0].split("=");
                if (parameter.length == 2 && parameter[0].equals("region")) {
                    regionFilter = parameter[1];
                }
            }

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS COVIDData (" +
                    "Region VARCHAR(255)," +
                    "Country VARCHAR(255)," +
                    "TotalCases INT," +
                    "TotalTests INT," +
                    "ActiveCases INT" +
                    ")";
            statement.executeUpdate(sql);
            System.out.println("Table created successfully.");

            List<CovidData> neededData = new ArrayList<>();
            try {
                String url = "https://www.worldometers.info/coronavirus/";
                Document document = Jsoup.connect(url).get();

                // Select the table rows using the CSS selector
                Elements rows = document.select("#main_table_countries_today tbody tr");

                // Iterate over the rows
                for (Element row : rows) {
                    Elements cells = row.select("td");
                    if (cells.get(0).text().length() > 0) {
                        // Region
                        String region = cells.get(15).text().trim();
                        // Country
                        String country = cells.get(1).text().trim();
                        // Total cases
                        int totalCases = cells.get(2).text().length() > 0 && !cells.get(2).text().equals("N/A")
                                ? Integer.parseInt(cells.get(2).text().trim().replace(",", "")) : -1;
                        // Active cases
                        int activeCases = cells.get(8).text().length() > 0 && !cells.get(8).text().equals("N/A")
                                ? Integer.parseInt(cells.get(8).text().trim().replace(",", "")) : -1;
                        // Total Tests
                        int totalTests = cells.get(12).text().length() > 0 && !cells.get(12).text().equals("N/A")
                                ? Integer.parseInt(cells.get(12).text().trim().replace(",", "")) : -1;

                        CovidData covidData = new CovidData(region, country, totalCases, activeCases, totalTests);
                        neededData.add(covidData);

                        String insertSql = "INSERT INTO COVIDData (Region, Country, TotalCases, " +
                                "TotalTests, ActiveCases) VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
                        preparedStatement.setString(1, covidData.getRegion());
                        preparedStatement.setString(2, covidData.getCountry());
                        preparedStatement.setInt(3, covidData.getTotalCases());
                        preparedStatement.setInt(4, covidData.getTotalTests());
                        preparedStatement.setInt(5, covidData.getActiveCases());

                        preparedStatement.executeUpdate();
                    }
                }

                // Print formatted table for the requested region
                if (regionFilter != null) {
                    System.out.println("COVID Data for Region: " + regionFilter);
                    System.out.println("---------------------------------------");
                    System.out.println("Region\t\tCountry\t\tTotal Cases\tTotal Tests\tActive Cases");
                    System.out.println("---------------------------------------");
                    for (CovidData data : neededData) {
                        if (data.getRegion().equalsIgnoreCase(regionFilter)) {
                            System.out.printf("%s\t%s\t%d\t\t%d\t\t%d\n",
                                    data.getRegion(), data.getCountry(), data.getTotalCases(),
                                    data.getTotalTests(), data.getActiveCases());
                        }
                    }

                    String csvFileName = String.format("export_%s.csv", LocalDate.now().toString());
                    File csvFile = new File(csvFileName);
                    PrintWriter csvWriter = new PrintWriter(csvFile);
                    csvWriter.println("Region,Country,Total Cases,Total Tests,Active Cases");
                    for (CovidData data : neededData) {
                        if (data.getRegion().equalsIgnoreCase(regionFilter)) {
                            csvWriter.printf("%s,%s,%d,%d,%d\n",
                                    data.getRegion(), data.getCountry(), data.getTotalCases(),
                                    data.getTotalTests(), data.getActiveCases());
                        }
                    }

                    csvWriter.close();
                    System.out.println("Data exported to CSV file: " + csvFileName);

                }

                else {

                    // Export data to CSV file
                    String csvFileName = String.format("export_%s.csv", LocalDate.now().toString());
                    File csvFile = new File(csvFileName);
                    PrintWriter csvWriter = new PrintWriter(csvFile);
                    csvWriter.println("Region,Country,Total Cases,Total Tests,Active Cases");
                    for (CovidData data : neededData) {
                            csvWriter.printf("%s,%s,%d,%d,%d\n",
                                    data.getRegion(), data.getCountry(), data.getTotalCases(),
                                    data.getTotalTests(), data.getActiveCases());
                    }
                    csvWriter.close();
                    System.out.println("Data exported to CSV file: " + csvFileName);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Database connection closed successfully.");
                }
            } catch (SQLException e) {
                System.out.println("Failed to close the database connection: " + e.getMessage());
            }
        }
    }
}