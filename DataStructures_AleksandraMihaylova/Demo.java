package taskDataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(5000));
        }
        System.out.println("List of random numbers: " + list);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int number = scanner.nextInt();
        if (list.contains(number)) {
            int index = list.indexOf(number);
            System.out.println("The number " + number + " was found at index " + index);
        } else {
            System.out.println("The number " + number + " was not found in the list");
        }
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Minimum number in the list: " + min);
        System.out.println("Maximum number in the list: " + max);
        System.out.println("All the elements in the list:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}