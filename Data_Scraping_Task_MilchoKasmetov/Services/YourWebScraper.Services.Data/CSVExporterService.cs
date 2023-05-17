using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using YourWebScraper.Web.ViewModels.Home;

namespace YourWebScraper.Services.Data
{
    public class CSVExporterService : IExporter
    {
        public void Export(IndexViewModel countriesModel, string region)
        {
            string directoryPathInput = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);

            DataTable dt = new DataTable();
            dt.Columns.Add("Region", typeof(string));
            dt.Columns.Add("Country name", typeof(string));
            dt.Columns.Add("Active Cases", typeof(long));
            dt.Columns.Add("Total Cases", typeof(long));
            dt.Columns.Add("Total Tests", typeof(long));

            foreach (var country in countriesModel.Countries)
            {
                dt.Rows.Add(country.Region, country.Name, country.ActiveCases, country.TotalCases, country.TotalTests);

            }

            string csv = string.Empty;

            foreach (DataColumn column in dt.Columns)
            {
                csv += column.ColumnName + ',';
            }

            csv += "\r\n";

            foreach (DataRow row in dt.Rows)
            {
                foreach (DataColumn column in dt.Columns)
                {
                    csv += row[column].ToString().Replace(",", ";") + ',';
                }

                csv += "\r\n";
            }

            string directoryPath = directoryPathInput;
            Directory.CreateDirectory(directoryPath);

            string filePath = Path.Combine(directoryPath, $"export_{region}_{DateTime.Now.Year}_{DateTime.Now.Month}_{DateTime.Now.Day}.csv");
            File.WriteAllText(filePath, csv);
        }
    }
}
