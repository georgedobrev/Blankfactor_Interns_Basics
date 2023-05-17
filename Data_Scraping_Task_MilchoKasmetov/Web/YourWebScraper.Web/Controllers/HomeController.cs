namespace YourWebScraper.Web.Controllers
{
    using System.Diagnostics;

    using YourWebScraper.Web.ViewModels;

    using Microsoft.AspNetCore.Mvc;
    using YourWebScraper.Services.Data;
    using System.Collections.Generic;
    using OpenQA.Selenium;
    using OpenQA.Selenium.Chrome;
    using OpenQA.Selenium.Support.UI;
    using System;
    using System.Threading;
    using System.Xml.Linq;
    using YourWebScraper.Web.ViewModels.Home;
    using System.Security.Policy;
    using System.Linq;
    using System.Threading.Tasks;

    public class HomeController : BaseController
    {
        private readonly IWebScrapeService webScrapeService;
        private readonly ICountryService countryService;
        private readonly IExporter exporterService;

        //If i had more time i would think for more optimal way but due to deadlines and comming projects this is the solution that i came with.
        public HomeController(
            IWebScrapeService webScrapeService,
            ICountryService countryService,
            IExporter exporterService)
        {
            this.webScrapeService = webScrapeService;
            this.countryService = countryService;
            this.exporterService = exporterService;
        }

        public async Task<IActionResult> Index()
        {
            string url = "https://www.worldometers.info/coronavirus";

            var viewModel = new IndexViewModel()
            {
                Countries = this.webScrapeService.FetchAllCountries(url),
            };

            foreach (var item in viewModel.Countries)
            {
                await this.countryService.CreateAsync(item.Name, item.Region, item.TotalCases, item.TotalTests, item.ActiveCases);
            }

            return this.View(viewModel);
        }


        public IActionResult All()
        {
            var viewModel = new IndexViewModel()
            {
                Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("Europe"),
            };

            return this.View(viewModel);
        }

        [HttpPost]
        public IActionResult All(IndexViewModel model)
        {

            model.Countries = this.countryService.GetAll<IndexCountryViewModel>();

            this.exporterService.Export(model, "All");

            return this.RedirectToAction("All", "Home");
        }








        public IActionResult Europe()
        {
            var viewModel = new IndexViewModel()
            {
                Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("Europe"),
            };

            return this.View(viewModel);
        }

        [HttpPost]
        public IActionResult Europe(IndexViewModel model)
        {

            model.Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("Europe");

            this.exporterService.Export(model, "Europe");

            return this.RedirectToAction("Europe", "Home");
        }

        public IActionResult NorthAmerica()
        {
            var viewModel = new IndexViewModel()
            {
                Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("North America"),
            };

            return this.View(viewModel);

        }

        [HttpPost]
        public IActionResult NorthAmerica(IndexViewModel model)
        {
            model.Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("North_America");

            this.exporterService.Export(model, "North_America");

            return this.RedirectToAction("NorthAmerica", "Home");
        }

        public IActionResult Asia()
        {
            var viewModel = new IndexViewModel()
            {
                Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("Asia"),
            };

            return this.View(viewModel);
        }

        [HttpPost]
        public IActionResult Asia(IndexViewModel model)
        {
            model.Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("Asia");

            this.exporterService.Export(model, "Asia");

            return this.RedirectToAction("Asia", "Home");
        }

        public IActionResult SouthAmerica()
        {
            var viewModel = new IndexViewModel()
            {
                Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("South America"),
            };

            return this.View(viewModel);
        }

        [HttpPost]
        public IActionResult SouthAmerica(IndexViewModel model)
        {
            model.Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("South America");

            this.exporterService.Export(model, "South_America");

            return this.RedirectToAction("SouthAmerica", "Home");
        }

        public IActionResult Africa()
        {
            var viewModel = new IndexViewModel()
            {
                Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("Africa"),
            };

            return this.View(viewModel);
        }

        [HttpPost]
        public IActionResult Africa(IndexViewModel model)
        {
            model.Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("Africa");

            this.exporterService.Export(model, "Africa");

            return this.RedirectToAction("Africa", "Home");
        }

        public IActionResult AustraliaOceania()
        {
            var viewModel = new IndexViewModel()
            {
                Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("Australia/Oceania"),
            };

            return this.View(viewModel);
        }

        [HttpPost]
        public IActionResult AustraliaOceania(IndexViewModel model)
        {
            model.Countries = this.countryService.GetSpecificRegion<IndexCountryViewModel>("Australia/Oceania");

            this.exporterService.Export(model, "Australia_Oceania");

            return this.RedirectToAction("AustraliaOceania", "Home");
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return this.View(
                new ErrorViewModel { RequestId = Activity.Current?.Id ?? this.HttpContext.TraceIdentifier });
        }
    }
}
