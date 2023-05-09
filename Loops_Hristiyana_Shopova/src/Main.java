
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(isPalindrome(num));
        fizzBuzz();
        //mergeTwoStrings();
        //checkTheSum();
        return;
    }

    public static boolean isPalindrome(int number) {
        //Scanner scanner = new Scanner(System.in);
        //String number = scanner.nextLine();
        int oldNum = number;

        int reversed = 0;
        while (number > 0)
        {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;

        }
        return oldNum == reversed;
        /*
        int flag = 0;
        int i = 0;
        for (int j = number.length() - 1 ; j >= 0; j--) {
            if (number.charAt(i) == number.charAt(j)) {
                flag++;
                i++;
            }
        }
        if(flag == number.length())   {
            System.out.println("This number is a palindrome.");
        } else {
            System.out.println("This number is NOT a palindrome.");
        }
        */
    }

    public static String mergeTwoStrings() {

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        String result = "";

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }
        return result;

    }

    public static List<String> fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        //  int n = scanner.nextInt();
        int n = Integer.parseInt(scanner.nextLine());
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                arr.add(i, "FizzBuzz");

            } else if (i % 5 == 0) {
                arr.add(i, "Buzz");

            } else if (i % 3 == 0) {
                arr.add(i, "Fizz");

            } else {
                arr.add(i, String.valueOf(i));
            }
        }
        System.out.println(arr);
        return arr;
    }

    public static boolean checkTheSum() {
        Scanner scanner = new Scanner(System.in);

        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        // checkTheSumNegativeResult();
        boolean flag = false;

        for (int i = 0; i < firstWord.length(); i++) {
            sum1 += (int)firstWord.charAt(i) - 97;
        }
        for (int i = 0; i < secondWord.length(); i++) {
            sum2 += (int)secondWord.charAt(i) - 97;
        }
        for (int i = 0; i < targetWord.length(); i++) {
            sum3 += (int)targetWord.charAt(i) - 97;
        }

        if (sum1 + sum2 == sum3)
        {
            flag = true;
        } else
        {
            flag = false;
        }

        return flag;
    }
}