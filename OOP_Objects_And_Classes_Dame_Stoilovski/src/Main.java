import CarsAndCargo.CarApp;
import FamilyAndPersons.SetFamily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        DateModifier dateModifier = new DateModifier();
//        dateModifier.calculateDifference("2015-05-25", "2015-06-25");
//        System.out.println(dateModifier.getDaysDifference());

        // SetFamily.setFamilyMembers();

        // CarApp.startMakingCars();
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3 , 4, 5, 6));
        System.out.println(ints);
        GenericMethod.swap(ints, 1, 5);
        System.out.println(ints);
        GenericMethod.swap(ints, 0, 2);
        System.out.println(ints);
        }
    }