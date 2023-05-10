import java.util.Scanner;

public class LetterSum {
    public static void main(String[] args) {

        Scanner scannerTest = new Scanner(System.in);
        System.out.println("Enter a first word here: ");

        String str1 = scannerTest.nextLine().toUpperCase();
        System.out.println("Enter a second word here: ");

        String str2 = scannerTest.nextLine().toUpperCase();
        System.out.println("Enter a target word here: ");

        String target = scannerTest.nextLine().toUpperCase();
        System.out.println(compareStr(str1, str2, target));
    }

    private static int stringValue(String str) {
        int sum = 0;

        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sum += ch - 'A';
            }
        }
        return sum;
    }

    private static boolean compareStr(String s1, String s2, String target) {
        if ((stringValue(s1) + stringValue(s2)) == stringValue(target)) {
            return true;
        } else {
            return false;
        }
    }
}
