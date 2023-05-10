import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SumPairsNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of number to sum: ");
        int countOfNumbers = Integer.parseInt(scanner.nextLine());


        int[] numbers = new int[countOfNumbers];

        HashMap<Integer,Integer> map = new LinkedHashMap<>();

        System.out.print("Enter the array of numbers: [");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("]");

        System.out.print("Enter the target sum: ");
        int targetSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                if(numbers[j] + numbers[i] == targetSum)
                {
                    if(map.containsKey(numbers[i]) && map.containsKey(numbers[j]))
                    {
                        continue;
                    } else
                    {
                        map.put(numbers[i],i);
                        map.put(numbers[j],i);

                    }

                    System.out.printf("(%d, %d)", numbers[i], numbers[j]);
                }
            }
        }
    }
}