package taskLoops;

import java.util.Scanner;

public class MergeTwoStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String result = mergeTwoStrings(word1, word2);
        System.out.println(result);
    }

    public static String mergeTwoStrings (String word1, String word2) {
        String merged = "";
        int i = 0;
        int j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged += word1.charAt(i);
                i++;
            }
            if (j < word2.length()) {
                merged += word2.charAt(j);
                j++;
            }
        }
        return merged;
    }
}
