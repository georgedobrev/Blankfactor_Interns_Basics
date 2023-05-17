using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using YourWebScraper.Web.ViewModels.Home;

namespace YourWebScraper.Services.Data
{
    public interface IExporter
    {
        void Export(IndexViewModel countriesModel,string region);
    }
}
