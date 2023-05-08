package attractions;

import attractions.TouristAttraction;

public class NationalPark extends TouristAttraction {
    private String openingHours;


    public NationalPark(String name, String address, double rating, double guideBookPrice) {
        super(name, address, rating, guideBookPrice);
        this.openingHours = "08:00";
    }
    public NationalPark(String name, String address, double rating, double guideBookPrice, String openingHours) {
        this(name, address, rating, guideBookPrice);
        this.setOpeningHours(openingHours);
    }

    public double getTicketPrice() {
        return 0.0;
    }


    @Override
    public void setOpeningHours(String openingHours) {
        boolean isValidFormat = openingHours.matches("^\\d{2}:\\d{2}$");
        if (isValidFormat) {
            this.openingHours = openingHours;
        } else {
            this.openingHours = "08:00";
        }
    }

    public String getOpeningHours() {
        return openingHours;
    }

}
