import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static List<String> fizzBuzzList(int number) {
        List<String> fizzBuzz = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzz.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(Integer.toString(i));
            }
        }
        return fizzBuzz;
    }


    public static void main(String[] args) {
        // Scanner scanner=new Scanner(System.in);
        // List<String> result= fizzBuzzList(scanner.nextInt());
        // System.out.println(Arrays.toString(result.toArray()));
//
//        MergeTwoStrings mergeTwoStrings=new MergeTwoStrings();
//      String result= mergeTwoStrings.mergeTwoString("abcdawdawd","pqrty");
//        System.out.println(result);

        // IsPalindrome isPalindrome=new IsPalindrome();
        //boolean result=isPalindrome.isPalindrome("aka");
        // System.out.println(result);


//        CheckTheSum checkTheSum=new CheckTheSum();
//        boolean result=checkTheSum.checkTheSum("acb","cba","cdb");
//        System.out.println(result);

    }


}
