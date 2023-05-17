package org.example;

import java.io.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Extract {

    public static void ExtractDataToCSV(String parameter, Connection connection) throws SQLException, IOException {
        String sql = String.format("SELECT * FROM covidInfo WHERE region = '%s'", parameter);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd");
        LocalDateTime now = LocalDateTime.now();

        if (parameter.equals("Australia/Oceania")) {
            parameter = "Australia_Oceania";
        }
        parameter = parameter.replaceAll("\\s", "");
        String csvFilePath = String.format("./export_%s_%s.csv", parameter, dtf.format(now));

        Extracting(sql, csvFilePath, connection);
        PrintCSV(csvFilePath);
    }

    public static void ExtractDataToCSV(Connection connection) throws SQLException, IOException {
        String sql = "SELECT * FROM covidInfo";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd");
        LocalDateTime now = LocalDateTime.now();

        String csvFilePath = String.format("./export_%s.csv", dtf.format(now));

        Extracting(sql, csvFilePath, connection);
    }


    public static void Extracting(String sql, String csvPath, Connection connection) throws SQLException, IOException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        FileWriter fileWriter = new FileWriter(csvPath);

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("country" + "," + "region" + "," + "totalCases" + "," + "totalTests" + "," + "activeCases");
        while (resultSet.next()) {

            String country = resultSet.getString("country");
            String region = resultSet.getString("region");
            String totalCases = resultSet.getString("totalCases");
            String totalTests = resultSet.getString("totalTests");
            String activeCases = resultSet.getString("activeCases");

            printWriter.println(country + "," + region + "," + totalCases + "," + totalTests + "," + activeCases);
        }
        resultSet.close();
        statement.close();
        connection.close();
        printWriter.close();
        fileWriter.close();

        System.out.println("CSV file was created successfully.");
    }

    static void PrintCSV(String csvPath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvPath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
