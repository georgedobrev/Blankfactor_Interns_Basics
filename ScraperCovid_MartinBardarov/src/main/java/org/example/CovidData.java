package org.example;



    public class CovidData {

        private String region;
        private String country;
        private int totalCases;
        private int totalTests;
        private int activeCases;

        // Constructor
        public CovidData(String region, String country, int totalCases, int totalTests, int activeCases) {
            this.region = region;
            this.country = country;
            this.totalCases = totalCases;
            this.totalTests = totalTests;
            this.activeCases = activeCases;
        }

        // Getters and setters
        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getTotalCases() {
            return totalCases;
        }

        public void setTotalCases(int totalCases) {
            this.totalCases = totalCases;
        }

        public int getTotalTests() {
            return totalTests;
        }

        public void setTotalTests(int totalTests) {
            this.totalTests = totalTests;
        }

        public int getActiveCases() {
            return activeCases;
        }

        public void setActiveCases(int activeCases) {
            this.activeCases = activeCases;
        }

        @Override
        public String toString() {
            return "CovidData{" +
                    "region='" + region + '\'' +
                    ", country='" + country + '\'' +
                    ", totalCases=" + totalCases +
                    ", totalTests=" + totalTests +
                    ", activeCases=" + activeCases +
                    '}';
        }
    }



