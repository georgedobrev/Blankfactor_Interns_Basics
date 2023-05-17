import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FizzBuzz {
    //FizzBuzz
    //Input: n = 15
    //Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

        public static void callingFizzBuzz(){
            List<String> numbers = new ArrayList<>();
            int n = 15;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    numbers.add("FizzBuzz");

                } else if (i % 3 == 0) {
                    numbers.add("Fizz");

                } else if (i % 5 == 0) {
                    numbers.add("Buzz");

                } else {
                    numbers.add(Integer.toString(i));
                }
            }
            System.out.println(numbers);
        }
        public static void main(String[] args) {
            callingFizzBuzz();
        }
    }








