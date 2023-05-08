package attractions;

public class Cave extends TouristAttraction {
    private double ticketPrice;
    private String openingHours;

    public Cave(String name, String address, double rating, double guideBookPrice, double ticketPrice) {
        super(name, address, rating, guideBookPrice);
        this.setTicketPrice(ticketPrice);
        this.openingHours = "08:00";
    }
    public Cave(String name, String address, double rating, double guideBookPrice, double ticketPrice, String openingHours) {
        this(name, address, rating, guideBookPrice, ticketPrice);
        this.setOpeningHours(openingHours);
    }

    public double getTicketPrice() {
        return ticketPrice;
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

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}
