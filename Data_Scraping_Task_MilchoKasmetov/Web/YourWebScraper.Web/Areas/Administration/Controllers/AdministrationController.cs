namespace YourWebScraper.Web.Areas.Administration.Controllers
{
    using YourWebScraper.Common;
    using YourWebScraper.Web.Controllers;

    using Microsoft.AspNetCore.Authorization;
    using Microsoft.AspNetCore.Mvc;

    [Authorize(Roles = GlobalConstants.AdministratorRoleName)]
    [Area("Administration")]
    public class AdministrationController : BaseController
    {
    }
}
