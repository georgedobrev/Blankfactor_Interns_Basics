import CarsAndCargo.CarApp;
import FamilyAndPersons.SetFamily;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateModifier dateModifier = new DateModifier();
        dateModifier.calculateDifference("2015-05-25", "2015-06-25");
        System.out.println(dateModifier.getDaysDifference());

        // SetFamily.setFamilyMembers();

        CarApp.startMakingCars();
        }
    }