using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using YourWebScraper.Data.Models;
using YourWebScraper.Services.Mapping;

namespace YourWebScraper.Web.ViewModels.Home
{
    public class IndexCountryViewModel : IMapFrom<Country>
    {
        [Required]
        [StringLength(100)]
        public string Name { get; set; }

        [Required]
        [StringLength(100)]
        public string Region { get; set; }

        [Required]
        [Range(0, long.MaxValue)]
        public long TotalCases { get; set; }

        [Required]
        [Range(0, long.MaxValue)]
        public long TotalTests { get; set; }

        [Required]
        [Range(0, long.MaxValue)]
        public long ActiveCases { get; set; }
    }
}
