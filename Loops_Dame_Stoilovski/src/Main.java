import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BuzzFizz buzzFizz = new BuzzFizz();
        List<String> result3 = buzzFizz.fizzBuzz(15);
        System.out.println(Arrays.toString(result3.toArray()));

        ConcatenateTwoStrings concTwoStr = new ConcatenateTwoStrings();
        String firstWord = "Dame";
        String secondWord = "Dame";
        String result = concTwoStr.mergeTwoStrings(firstWord, secondWord);
        System.out.println(result);

        PalindromeCheck palindrome = new PalindromeCheck();
        String word = "121121";
        boolean result1 = palindrome.CheckForPalindrome(word);
        System.out.println(result1);

        CheckTheSum sumChecker = new CheckTheSum();
        String first = "acb";
        String second = "cba";
        String third = "cdb";
        boolean result2 = sumChecker.TwoStringsEqualsThird(first, second, third);
        System.out.println(result2);
        }
    }
