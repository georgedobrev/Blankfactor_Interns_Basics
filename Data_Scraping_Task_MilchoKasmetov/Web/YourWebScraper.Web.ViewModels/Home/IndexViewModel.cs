using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YourWebScraper.Web.ViewModels.Home
{
    public class IndexViewModel
    {
        public IEnumerable<IndexCountryViewModel> Countries { get; set; }
    }
}
