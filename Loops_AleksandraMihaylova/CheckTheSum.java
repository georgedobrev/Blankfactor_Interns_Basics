package taskLoops;

import java.util.Scanner;

public class CheckTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String targetWord = scanner.nextLine();

        checkSum(firstWord, secondWord, targetWord);

    }

    public static boolean checkSum (String firstWord, String secondWord, String targetWord ) {

        int sum = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            sum += (int) firstWord.charAt(i) - 97;
        }
        for (int i = 0; i < secondWord.length(); i++) {
            sum += (int) secondWord.charAt(i) - 97;
        }
        int targetSum = 0;
        for (int i = 0; i < targetWord.length(); i++) {
            targetSum += (int) targetWord.charAt(i) - 97;
        }
        boolean isEqual = sum == targetSum;

        if (isEqual) {
            System.out.println("ASCII sum is equal.");
        } else {
            System.out.println("ASCII sum is not equal.");
        }
        return  isEqual;
    }
}
