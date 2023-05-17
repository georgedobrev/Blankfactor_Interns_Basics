using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace YourWebScraper.Data.Migrations
{
    /// <inheritdoc />
    public partial class DataBaseRegionAdd : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<string>(
                name: "Region",
                table: "Countries",
                type: "nvarchar(100)",
                maxLength: 100,
                nullable: false,
                defaultValue: "");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "Region",
                table: "Countries");
        }
    }
}
