using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace YourWebScraper.Services.Data
{
    public interface ICountryService
    {
        public IEnumerable<T> GetAll<T>();

        public IEnumerable<T> GetSpecificRegion<T>(string region);

        Task CreateAsync(string name, string region, long totalCases, long totalTests, long activeCases);
    }

}
