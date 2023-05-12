package attractions;

public abstract class TouristAttraction {
    private final String name;
    private final String address;
    private double rating;
    private final double guideBookPrice;

    public TouristAttraction(String name, String address, double rating, double guideBookPrice) {
        this.name = name;
        this.address = address;
        this.setRating(rating);
        this.guideBookPrice = guideBookPrice;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getRating() {
        return rating;
    }

    // the rating should be in range from 1 to 5 stars
    public void setRating(double rating) {
        if (rating < 1) {
            this.rating = 1;
        } else if (rating > 5) {
            this.rating = 5;
        } else {
            this.rating = rating;
        }
    }

    public double getGuideBookPrice() {
        return guideBookPrice;
    }

    public abstract double getTicketPrice();

    public abstract void setOpeningHours(String openingHours);
    public abstract String getInfo();
}
