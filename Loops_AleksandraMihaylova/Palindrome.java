package taskLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        palindrome(number);
    }
    public static int palindrome (int number) {
        int originalNum = number;
        int reverseNum = 0;

        while (number != 0) {
            int reminder = number % 10;
            reverseNum = reverseNum * 10 + reminder;
            number = number / 10;
        }
        boolean isPalindrome = originalNum == reverseNum;
        if (isPalindrome) {
            System.out.println(originalNum + " is palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");

        }
        return number;
    }
}
