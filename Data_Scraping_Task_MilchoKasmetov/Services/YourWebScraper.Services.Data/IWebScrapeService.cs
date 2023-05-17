using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using YourWebScraper.Web.ViewModels.Home;

namespace YourWebScraper.Services.Data
{
    public interface IWebScrapeService
    {
        public IEnumerable<IndexCountryViewModel> FetchAllCountries(string url, string region = null);
    }
}
