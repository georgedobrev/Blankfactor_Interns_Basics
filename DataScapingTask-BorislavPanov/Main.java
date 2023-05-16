import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:covid.db";
        String tableName = "covid_data";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 or 2: (1 for printing data from the database, 2 for inserting data into the database).");
        int takeInput = scanner.nextInt();
        scanner.nextLine();

        try {
            createTable(url, tableName);

            if (takeInput == 1) {
                System.out.println("Please enter the region (e.g., Europe, Asia):");
                String region = scanner.nextLine();
                printCountriesInRegion(url, tableName, region);
                exportDataToCSV(url, tableName, region);
            } else {
                fetchDataAndInsert(url, tableName);
                System.out.println("Data inserted into the table successfully.");
                exportDataToCSV(url, tableName, "");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createTable(String url, String tableName) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Connected to the database successfully.");

                String createTableQuery = "CREATE TABLE IF NOT EXISTS " + tableName + " (region TEXT, country TEXT, total_cases TEXT, total_tests TEXT, active_cases TEXT)";
                PreparedStatement createTableStatement = conn.prepareStatement(createTableQuery);
                createTableStatement.execute();

            } else {
                System.out.println("Failed to connect to the database.");
            }
        }
    }

    public static void fetchDataAndInsert(String url, String tableName) {
        try {
            Document doc = Jsoup.connect("https://www.worldometers.info/coronavirus/").get();
            Elements table = doc.select("table[id=main_table_countries_today]");
            Elements rows = table.select("tr:gt(7)");

            for (Element row : rows) {
                Elements tds = row.select("td:not([rowspan])");
                Element region = row.selectFirst("td[style*=display:none]");

                String regionParsed = region.text().trim();
                String country = tds.get(1).text().trim();
                String totalCases = getCellValue(tds.get(2));
                String totalTests = getCellValue(tds.get(12));
                String activeCases = getCellValue(tds.get(8));

                insertData(url, tableName, regionParsed, country, totalCases, totalTests, activeCases);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getCellValue(Element cell) {
        String value = cell.text().replace(",", "").trim();
        return value.isEmpty() || value.equals("N/A") ? "Empty" : value;
    }

    public static void insertData(String url, String tableName, String region, String country, String totalCases, String totalTests, String activeCases) {
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {

                String insertQuery = "INSERT INTO " + tableName + " (region, country, total_cases, total_tests, active_cases) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
                insertStatement.setString(1, region);
                insertStatement.setString(2, country);
                insertStatement.setString(3, totalCases);
                insertStatement.setString(4, totalTests);
                insertStatement.setString(5, activeCases);
                insertStatement.executeUpdate();

            } else {
                System.out.println("Failed to connect to the database.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printCountriesInRegion(String url, String tableName, String region) {
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Connected to the database successfully.");

                String selectQuery = "SELECT * FROM " + tableName + " WHERE region = ?";
                PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
                selectStatement.setString(1, region);

                ResultSet resultSet = selectStatement.executeQuery();

                if (resultSet.isBeforeFirst()) {
                    System.out.println("Data for region: " + region);
                    System.out.println("+-------------------+---------------------+--------------+-------------+--------------+");

                    System.out.printf("| %-17s | %-19s | %-12s | %-11s | %-12s |%n", "Region", "Country", "Total Cases", "Total Tests", "Active Cases");
                    System.out.println("+-------------------+---------------------+--------------+-------------+--------------+");

                    while (resultSet.next()) {
                        String regionValue = resultSet.getString("region");
                        String country = resultSet.getString("country");
                        String totalCases = resultSet.getString("total_cases");
                        String totalTests = resultSet.getString("total_tests");
                        String activeCases = resultSet.getString("active_cases");

                        System.out.printf("| %-17s | %-19s | %-12s | %-11s | %-12s |%n",
                                regionValue, country, totalCases, totalTests, activeCases);
                    }

                    System.out.println("+-------------------+---------------------+--------------+-------------+--------------+");
                } else {
                    System.out.println("No data found for region: " + region);
                }
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exportDataToCSV(String url, String tableName, String regionParam) {
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                String selectQuery;
                if (regionParam.isEmpty()) {
                    selectQuery = "SELECT * FROM " + tableName;
                } else {
                    selectQuery = "SELECT * FROM " + tableName + " WHERE region = ?";
                }

                PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
                if (!regionParam.isEmpty()) {
                    selectStatement.setString(1, regionParam);
                }

                ResultSet resultSet = selectStatement.executeQuery();

                if (resultSet.isBeforeFirst()) {
                    String fileName = "export_" + regionParam.toLowerCase() + "_" + getCurrentDate() + ".csv";
                    try (FileWriter writer = new FileWriter(fileName)) {
                        writer.write("Region,Country,Total Cases,Total Tests,Active Cases\n");

                        while (resultSet.next()) {
                            String region = resultSet.getString("region");
                            String country = resultSet.getString("country");
                            String totalCases = resultSet.getString("total_cases");
                            String totalTests = resultSet.getString("total_tests");
                            String activeCases = resultSet.getString("active_cases");

                            writer.write(region + "," + country + "," + totalCases + "," + totalTests + "," + activeCases + "\n");
                        }

                        System.out.println("Data exported to " + fileName + " successfully.");
                    } catch (IOException e) {
                        throw new RuntimeException("Failed to export data to CSV file: " + e.getMessage());
                    }
                } else {
                    System.out.println("No data found for region: " + regionParam);
                }
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getCurrentDate() {
        java.util.Date today = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(today.getTime());
        return sqlDate.toString();
    }
}