import attractions.Museum;
import attractions.NationalPark;
import people.Group;
import people.Individual;
import people.SpecialIndividual;


public class Main {
    public static void main(String[] args) {
        Museum museumOfHistory = new Museum("Museum of History", "1 Main Street", 5, 10, 2.00);
        NationalPark pirin = new NationalPark("National Park Pirin", "Pirin mountain", 5, 1.50, "07:00");
        System.out.println();
        Group tourists = new Group(26, museumOfHistory);
        Group bigGroup = new Group(60, pirin);
        Individual dame = new Individual(museumOfHistory);
        SpecialIndividual invalidPerson = new SpecialIndividual(museumOfHistory);

        System.out.println(tourists);
        System.out.println();
        System.out.println(dame);
        System.out.println();
        System.out.println(invalidPerson);
        System.out.println();
        System.out.println(bigGroup);
        }
    }