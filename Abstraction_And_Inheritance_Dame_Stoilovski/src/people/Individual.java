package people;

import attractions.TouristAttraction;


public class Individual implements IndividualTourist{
    private TouristAttraction attraction;
    public Individual(TouristAttraction attraction) {
        this.attraction = attraction;
    }

    @Override
    public double individualExpenses() {
        return attraction.getTicketPrice() + attraction.getGuideBookPrice();
    }
    @Override
    public String toString() {
        return "The total cost for a individual to visit the " + attraction.getName() +
                " will be " + this.individualExpenses() + " leva. \n" + attraction.getInfo();
    }
}
