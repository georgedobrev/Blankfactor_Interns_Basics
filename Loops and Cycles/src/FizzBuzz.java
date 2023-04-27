import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        System.out.printf(String.valueOf(fizzbuzz(x)));
    }

    private static ArrayList<String> fizzbuzz(int n) {

        ArrayList<String> result = new ArrayList<String>();

        for(int i =1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

}
