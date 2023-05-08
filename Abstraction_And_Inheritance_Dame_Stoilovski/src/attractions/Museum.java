package attractions;

import attractions.TouristAttraction;

public class Museum extends TouristAttraction {
    private double ticketPrice;
    private String openingHours;

    public Museum(String name, String address, double rating, double ticketPrice, double guideBookPrice) {
        super(name, address, rating, guideBookPrice);
        this.setTicketPrice(ticketPrice);
        this.openingHours = "10:00";
    }
    public Museum(String name, String address, double rating, double ticketPrice, double guideBookPrice, String openingHours) {
        this(name, address, rating, guideBookPrice, ticketPrice);
        this.setOpeningHours(openingHours);
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public void setOpeningHours(String openingHours) {
        boolean isValidFormat = openingHours.matches("^\\d{2}:\\d{2}$");
        if (isValidFormat) {
            this.openingHours = openingHours;
        } else {
            this.openingHours = "10:00";
        }
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }


    public String getOpeningHours() {
        return openingHours;
    }

}
