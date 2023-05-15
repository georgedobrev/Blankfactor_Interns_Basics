using System;
namespace CovidCases
{
    public class Country
    {

        private string region;
        private string name;
        private int totalCases;
        private int totalTests;
        private int activeCases;

        public Country(string region, string name, int totalCases, int totalTests, int activeCases)
        {
            this.region = region;
            this.name = name;
            this.totalCases = totalCases;
            this.totalTests = totalTests;
            this.activeCases = activeCases;
        }

        public string Region { get => region; set => region = value; }
        public string Name { get => name; set => name = value; }
        public int TotalCases { get => totalCases; set => totalCases = value; }
        public int TotalTests { get => totalTests; set => totalTests = value; }
        public int ActiveCases { get => activeCases; set => activeCases = value; }
    }
}

