package taskLoops;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fizzBuzz(n);
    }
   public static int fizzBuzz (int n) {
       int i = 1;

       while (i <= n) {
           if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
           } else if (i % 3 == 0) {
               System.out.println("Fizz");
           } else if (i % 5 == 0) {
               System.out.println("Buzz");
           } else {
               System.out.println(i);
           }
           i++;
       }
       return i;
   }
}
//    prints integers one-to-N, labeling any integers divisible by three as “Fizz,”
//    integers divisible by five as “Buzz” and integers divisible by both three and five as “FizzBuzz.”