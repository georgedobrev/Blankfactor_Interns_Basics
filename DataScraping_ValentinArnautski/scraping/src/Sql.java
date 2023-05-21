import java.sql.*;

public class Sql {

    public static void main(String[] args) {

        String url = "jdbc:sqlite:coronavirus.db";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // Create table
            String sql = "CREATE TABLE IF NOT EXISTS covid_data (\n"
                    + "    country_name TEXT NOT NULL,\n"
                    + "    total_cases INTEGER,\n"
                    + "    new_cases INTEGER,\n"
                    + "    active_cases INTEGER,\n"
                    + "    total_tests INTEGER\n"
                    + ");";
            stmt.execute(sql);

            // Insert data
            String insertSql = "INSERT INTO covid_data(country_name, total_cases, new_cases, active_cases, total_tests) "
                    + "VALUES(?,?,?,?,?)";

            // Here you can parse the data and insert it into the database
            String countryName = "USA";
            int totalCases = 1000;
            int newCases = 100;
            int activeCases = 800;
            int totalTests = 5000;

            try (PreparedStatement pstmt = conn.prepareStatement(insertSql)) {
                pstmt.setString(1, countryName);
                pstmt.setInt(2, totalCases);
                pstmt.setInt(3, newCases);
                pstmt.setInt(4, activeCases);
                pstmt.setInt(5, totalTests);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
