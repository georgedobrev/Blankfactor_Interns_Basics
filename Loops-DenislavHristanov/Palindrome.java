import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed*10 + digit;
            number /=10;
        }
        return original == reversed;
    }
}


