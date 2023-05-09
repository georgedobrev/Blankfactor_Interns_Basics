import attractions.Museum;
import people.Group;
import people.Individual;
import people.SpecialIndividual;


public class Main {
    public static void main(String[] args) {
        Museum museumOfHistory = new Museum("Museum of History", "1 Main Street", 5, 10, 2.00);

        System.out.println();
        Group tourists = new Group(26, museumOfHistory);
        Group bigGroup = new Group(60, museumOfHistory);
        Individual dame = new Individual(museumOfHistory);
        SpecialIndividual invalidPerson = new SpecialIndividual(museumOfHistory);
        System.out.println(tourists);
        System.out.println(dame);
        System.out.println(invalidPerson);
        System.out.println(bigGroup);
        }
    }