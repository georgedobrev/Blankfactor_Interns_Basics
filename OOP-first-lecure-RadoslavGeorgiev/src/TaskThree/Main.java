package TaskThree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Before swap: " + numbers);
        SwapListElements.swap(numbers, 0, 2);
        System.out.println("After swap: " + numbers);

        List<String> names = new ArrayList<>();
        names.add("fas");
        names.add("rqqd");
        names.add("agaafc");
        System.out.println("Before swap: " + names);
        SwapListElements.swap(names, 1, 2);
        System.out.println("After swap: " + names);
    }
}
