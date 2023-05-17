namespace YourWebScraper.Services.Data
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Linq;
    using System.Net;
    using System.Net.Http;
    using System.Net.Http.Headers;
    using System.Text;
    using System.Threading;
    using System.Threading.Tasks;
    using System.Threading.Tasks;

    using HtmlAgilityPack;
    using OpenQA.Selenium;
    using OpenQA.Selenium.Chrome;
    using OpenQA.Selenium.Interactions;
    using OpenQA.Selenium.Support.UI;
    using YourWebScraper.Data.Models;
    using YourWebScraper.Web.ViewModels.Home;

    public class WebScrapeService : IWebScrapeService
    {
        public IEnumerable<IndexCountryViewModel> FetchAllCountries(string url, string region = null)
        {
            var chromeOptions = new ChromeOptions();
            chromeOptions.AddArguments("headless");
            chromeOptions.AddArgument("--disable-gpu");
            var driver = new ChromeDriver();

            driver.Navigate().GoToUrl(url);

            var wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
            wait.Until(driver => (bool)(driver as IJavaScriptExecutor).ExecuteScript("return document.readyState == 'complete';"));

            IWebElement table = driver.FindElement(By.Id("main_table_countries_today"));
            IList<IWebElement> rows = table.FindElements(By.TagName("tr"))
                                           .Where(x => !string.IsNullOrEmpty(x.Text))
                                           .ToList();

            List<IndexCountryViewModel> result = new List<IndexCountryViewModel>();

            foreach (var row in rows.Skip(2))
            {
                IList<IWebElement> cells = row.FindElements(By.TagName("td"));

               var findContinetCell = row.FindElement(By.CssSelector($"td[data-continent]"));

                string continent = findContinetCell.GetAttribute("data-continent");

                //if (region != null)
                //{
                //    var check = row.FindElements(By.CssSelector($"td[data-continent='{region}']"));


                //    if (check.Count == 0)
                //    {
                //        continue;
                //    }
                //}

                var currentCountry = new IndexCountryViewModel()
                {
                    Name = cells[1].Text,
                    Region = continent,
                    TotalCases = long.TryParse(cells[2].Text.Replace(",", ""), out long totalCases) ? totalCases : 0,
                    ActiveCases = long.TryParse(cells[8].Text.Replace(",", ""), out long activeCases) ? activeCases : 0,
                    TotalTests = long.TryParse(cells[12].Text.Replace(",", ""), out long totalTests) ? totalTests : 0,
                };

                result.Add(currentCountry);
            }

            driver.Close();
            driver.Quit();

            return result;
        }
    }
}

