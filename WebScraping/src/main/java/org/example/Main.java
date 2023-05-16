package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {

        // TODO: 15.5.2023 г. Add ticket for database reload for better performence
        Scanner input = new Scanner(System.in);

        Connection connection = DriverManager.getConnection("jdbc:sqlite:covidInfo.db");
        createTable(connection);

        try {
            String url = "https://www.worldometers.info/coronavirus/";
            Document doc = Jsoup.connect(url).timeout(6000).get();
            Elements table = doc.select("table[id = main_table_countries_today]");
            for (Element row : table.select("tr:gt(7)")) {
                Elements tds = row.select("td:not([rowspan])");
                Element region = row.selectFirst("td[style*=display:none]");
                String insertData = "INSERT INTO covidInfo (region, country, totalCases, totalTests, activeCases) VALUES (?, ?,?,?,?);";
                insertInfo(insertData, region, tds);
            }
        } catch (Exception e) {
            System.out.println("Invalid URL");
        }

        System.out.println("Enter Region");
        String region = input.nextLine();
        printInfo(connection, region);
    }

    private static void createTable(Connection connection) {

        String createTableQuery = "CREATE TABLE IF NOT EXISTS covidInfo (region TEXT, country TEXT, totalCases INTEGER, totalTests INTEGER, activeCases INTEGER);";
        String rowsQuery = "SELECT COUNT(*) FROM covidInfo";
        String clear = "DELETE FROM covidInfo;";

        try {
            Class.forName("org.sqlite.JDBC");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(rowsQuery);

            int rowCount = 0;
            if (resultSet.next()) {
                rowCount = resultSet.getInt(1);
            }

            if (rowCount > 0) {
                statement.executeUpdate(clear);
            }

            statement.executeUpdate(createTableQuery);
            statement.close();
            System.out.println("Waiting for sync");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertInfo(String query, Element region, Elements tds) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:sqlite:covidInfo.db");

        String totalCases = tds.get(2).text().replace(",","");
        String totalTests = tds.get(12).text().replace(",","");
        String activeCases = tds.get(8).text().replace(",","");


        try {
            Class.forName("org.sqlite.JDBC");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, region.text());
            preparedStatement.setString(2, tds.get(1).text());
            preparedStatement.setString(3, totalCases);
            preparedStatement.setString(4, totalTests);
            preparedStatement.setString(5, activeCases);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printInfo(Connection connection, String region) {
        String regionSelect = "SELECT * FROM covidInfo WHERE region = '" + region + "'";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy_MM_dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        try {
            Class.forName("org.sqlite.JDBC");
            Statement statement = connection.createStatement();
            statement.executeUpdate(regionSelect);
            ResultSet resultSet = statement.executeQuery(regionSelect);

            String filePath = "export_"+region+ "_"+dtf.format(now) +".csv";

            try {
                File file = new File(filePath);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            String sheetInput = "Region, Country, Total Cases, Total Tests, Active Cases\n";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.write(sheetInput);

            } catch (IOException e) {
                e.printStackTrace();
            }

            while (resultSet.next()) {

                String regionCol = resultSet.getString("region");
                String countryCol = resultSet.getString("country");
                String totalCasesCol = resultSet.getString("totalCases");
                String totalTestsCol = resultSet.getString("totalTests");
                String activeCasesCol = resultSet.getString("activeCases");

                String filePath2 = "export_"+region+ "_"+dtf.format(now) +".csv";

                String sheetInput2 = regionCol + "," + countryCol + "," + totalCasesCol + "," + totalTestsCol + "," +activeCasesCol +"\n";

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath2, true))) {
                    writer.write(sheetInput2);

                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Region " + regionCol + ", Country: " + countryCol + ", Total cases: " + totalCasesCol + ", Total tests: " + totalTestsCol + ", Active cases: " + activeCasesCol);
            }

            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

