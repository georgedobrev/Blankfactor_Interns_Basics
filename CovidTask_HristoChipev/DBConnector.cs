using System;
using System.Data;
using Microsoft.Data.Sqlite;
namespace CovidCases
{
    public class DBConnector
    {
        private SqliteConnection connection;

        public DBConnector(string connectionStr)
        {
            connection = new SqliteConnection(connectionStr);
        }

        public void ExecuteQuery(string query)
        {
            connection.Open();
            SqliteCommand command = new SqliteCommand(query, connection);
            try
            {
                command.ExecuteNonQuery();
            }
            catch (Microsoft.Data.Sqlite.SqliteException e)
            {
                if (e.Message.Contains("SQLite Error 19"))
                {
                    query.Replace("insert", "update");
                }
                else
                {
                    Console.WriteLine(e.Message);
                }

            }


            connection.Close();
        }

        public void GetData()
        {
            var query = "select * from covid_cases;";
            connection.Open();
            SqliteCommand command = new SqliteCommand(query, connection);
            SqliteDataReader reader = command.ExecuteReader();


            Console.WriteLine("|{0,-10}|{1,-30}|{2,-30}|{3,-15}|{4,-15}|{5,-15}|",
                                          "ID", "Region", "Country", "Total Cases", "Total Tests", "Active Cases");
            Console.WriteLine("|{0,-10}|{1,-30}|{2,-30}|{3,-15}|{4,-15}|{5,-15}|",
                              new string('-', 10), new string('-', 30), new string('-', 30),
                              new string('-', 15), new string('-', 15), new string('-', 15));

            while (reader.Read())
            {
                int id = reader.GetInt32(0);
                string region = reader.GetString(1);
                string country = reader.GetString(2);
                int totalCases = reader.GetInt32(3);
                int totalTests = reader.GetInt32(4);
                int activeCases = reader.GetInt32(5);

                Console.WriteLine("|{0,-10}|{1,-30}|{2,-30}|{3,-15}|{4,-15}|{5,-15}|",
                                  id, region, country, totalCases, totalTests, activeCases);
            }
            Console.WriteLine();

            reader.Close();
            reader = command.ExecuteReader();
            ExportToCSV(reader);

            connection.Close();
        }

        public void GetData(string regionParam)
        {
            var query = $"select * from covid_cases where region = '{regionParam}';";
            connection.Open();
            SqliteCommand command = new SqliteCommand(query, connection);
            SqliteDataReader reader = command.ExecuteReader();


            Console.WriteLine("|{0,-10}|{1,-30}|{2,-30}|{3,-15}|{4,-15}|{5,-15}|",
                                          "ID", "Region", "Country", "Total Cases", "Total Tests", "Active Cases");
            Console.WriteLine("|{0,-10}|{1,-30}|{2,-30}|{3,-15}|{4,-15}|{5,-15}|",
                              new string('-', 10), new string('-', 30), new string('-', 30),
                              new string('-', 15), new string('-', 15), new string('-', 15));

            while (reader.Read())
            {
                int id = reader.GetInt32(0);
                string region = reader.GetString(1);
                string country = reader.GetString(2);
                int totalCases = reader.GetInt32(3);
                int totalTests = reader.GetInt32(4);
                int activeCases = reader.GetInt32(5);

                Console.WriteLine("|{0,-10}|{1,-30}|{2,-30}|{3,-15}|{4,-15}|{5,-15}|",
                                  id, region, country, totalCases, totalTests, activeCases);
            }
            Console.WriteLine();

            reader.Close();
            reader = command.ExecuteReader();
            ExportToCSV(reader, regionParam);

            connection.Close();
        }

        private void ExportToCSV(SqliteDataReader reader, string regionname = "All")
        {
            DataTable dataTable = new DataTable();
            dataTable.Columns.Add("ID", typeof(int));
            dataTable.Columns.Add("Region", typeof(string));
            dataTable.Columns.Add("Country", typeof(string));
            dataTable.Columns.Add("Total Cases", typeof(int));
            dataTable.Columns.Add("Total Test", typeof(int));
            dataTable.Columns.Add("Active Cases", typeof(int));

            while (reader.Read())
            {
                int id = reader.GetInt32(0);
                string region = reader.GetString(1);
                string country = reader.GetString(2);
                int totalCases = reader.GetInt32(3);
                int totalTests = reader.GetInt32(4);
                int activeCases = reader.GetInt32(5);

                dataTable.Rows.Add(id, region, country, totalCases, totalTests, activeCases);
            }

            string directoryPath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Exports");
            if (!Directory.Exists(directoryPath))
            {
                Directory.CreateDirectory(directoryPath);
            }

            string filePath = Path.Combine(directoryPath, $"export_{regionname}_{DateTime.Now.ToString("yy_MM_dd")}.csv");

            Console.WriteLine($"fileLocation: {filePath}");

            StreamWriter sw = new StreamWriter(filePath);

            for (int i = 0; i < dataTable.Columns.Count; i++)
            {
                sw.Write(dataTable.Columns[i]);
                if (i < dataTable.Columns.Count - 1)
                {
                    sw.Write(",");
                }
            }

            sw.Write(sw.NewLine);

            foreach (DataRow row in dataTable.Rows)
            {
                for (int i = 0; i < dataTable.Columns.Count; i++)
                {
                    sw.Write(row[i].ToString());
                    if (i < dataTable.Columns.Count - 1)
                    {
                        sw.Write(",");
                    }
                }
                sw.Write(sw.NewLine);
            }

            sw.Close();
        }

    }
}

