import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {
    public static String[] printFizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("Fizzbuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        String[] toArr = new String[list.size()];
        toArr = list.toArray(toArr);

        return toArr;
    }

    public static void main(String[] args) {
        int n = 15;

        String[] result = printFizzBuzz(n);

        System.out.println(Arrays.toString(result));
    }
}
