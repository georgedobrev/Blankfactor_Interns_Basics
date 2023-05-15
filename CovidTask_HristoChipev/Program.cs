using CovidCases;
using HtmlAgilityPack;
using RestSharp;

Console.WriteLine("...loading");

var client = new RestClient("https://www.worldometers.info/coronavirus/");
var request = new RestRequest();
var response = client.Get(request);

var document = new HtmlDocument();
document.LoadHtml(response.Content);
var table = document.DocumentNode.SelectSingleNode("//*[@id=\"main_table_countries_today\"]");

var covidData = new List<Country>();
var DBCovid = new DBConnector($"Data Source={AppDomain.CurrentDomain.BaseDirectory}DBCovid/covid.db;");

foreach (var row in table.SelectNodes("//*[@id=\"main_table_countries_today\"]/tbody[1]/tr"))

{
    var cells = row.SelectNodes("td");

    if (cells[0].InnerText.Length > 0)
    {
        // Region
        var region = cells[15].InnerText.Trim();

        // Country
        var country = cells[1].InnerText.Trim();

        // Total cases
        var totalCases = cells[2].InnerText.Length > 0 && !cells[2].InnerText.Equals("N/A")
            ? int.Parse(cells[2].InnerText.Trim().Replace(",", "")) : -1;

        // Active cases
        var activeCases = cells[8].InnerText.Length > 0 && !cells[8].InnerText.Equals("N/A")
            ? int.Parse(cells[8].InnerText.Trim().Replace(",", "")) : -1;

        // Total Tests
        var totalTest = cells[12].InnerText.Length > 0 && !cells[12].InnerText.Equals("N/A")
            ? int.Parse(cells[12].InnerText.Trim().Replace(",", "")) : -1;

        covidData.Add(new Country(region, country, totalCases, totalTest, activeCases));
    }
}

foreach (var country in covidData)
{
    var query = "insert into covid_cases (region, country, total_cases, total_tests, active_cases) values " +
         $"('{country.Region}', '{country.Name}', {country.TotalCases}, " +
         $"{country.TotalTests}, {country.ActiveCases});";

    DBCovid.ExecuteQuery(query);
}

Console.WriteLine("Enter 0 or 1 parameters");
if (int.Parse(Console.ReadLine()) == 0)
{
    DBCovid.GetData();
}
else if (int.Parse(Console.ReadLine()) == 1)
{
    Console.WriteLine("Enter region(Capital sensitive)");
    DBCovid.GetData(Console.ReadLine());
}
