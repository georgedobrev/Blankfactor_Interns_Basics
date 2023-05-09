package people;

import attractions.TouristAttraction;

public class SpecialIndividual implements IndividualTourist {
    private TouristAttraction attraction;
    public SpecialIndividual(TouristAttraction attraction){
        this.attraction = attraction;
    }
    @Override
    public double individualExpenses() {
        return 0;
    }

    public String toString() {
        return "There are no cost for a special individual to visit the " + attraction.getName() + ".\n" + attraction.getInfo();
    }
}
