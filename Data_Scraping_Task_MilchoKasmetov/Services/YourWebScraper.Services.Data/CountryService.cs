using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using YourWebScraper.Data.Common.Models;
using YourWebScraper.Data.Common.Repositories;
using YourWebScraper.Data.Models;
using YourWebScraper.Services.Mapping;

namespace YourWebScraper.Services.Data
{
    public class CountryService : ICountryService
    {
        private readonly IDeletableEntityRepository<Country> contriesRepo;

        public CountryService(IDeletableEntityRepository<Country> contriesRepo)
        {
            this.contriesRepo = contriesRepo;
        }

        public IEnumerable<T> GetAll<T>()
        {
            return this.contriesRepo.All().To<T>().ToList();
        }

        public IEnumerable<T> GetSpecificRegion<T>(string region)
        {
            return this.contriesRepo.All().Where(x => x.Region == region).OrderBy( x => x.Name).To<T>().ToList();
        }

        public async Task CreateAsync(string name, string region, long totalCases, long totalTests, long activeCases)
        {
            var countryFind = await this.contriesRepo.All().FirstOrDefaultAsync(x => x.Name == name);
            if (countryFind == null)
            {
                var country = new Country
                {
                    Name = name,
                    Region = region,
                    TotalCases = totalCases,
                    TotalTests = totalTests,
                    ActiveCases = activeCases,
                };

                await this.contriesRepo.AddAsync(country);
            }
            else
            {
                countryFind.Region = region;
                countryFind.TotalCases = totalCases;
                countryFind.TotalTests = totalTests;
                countryFind.ActiveCases = activeCases;
                this.contriesRepo.Update(countryFind);
            }

            await this.contriesRepo.SaveChangesAsync();
        }

    }
}
