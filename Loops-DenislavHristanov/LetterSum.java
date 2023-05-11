import java.util.Scanner;
import java.util.StringJoiner;

public class LetterSum {
    public static void  main(String[] args) {
        Scanner scannerTest = new Scanner(System.in);
        System.out.println("Enter a first word: ");
        String str1 = scannerTest.nextLine();

        System.out.println("Enter a second word: ");
        String str2 = scannerTest.nextLine();

        System.out.println("Enter a target word: ");
        String target = scannerTest.nextLine();

        System.out.println(compareStr(str1, str2, target));
    }
     private static int StringValue(String str){

         int sum = 0;

         for (char ch : str.toCharArray()) {
             if (ch >= 'A' && ch <= 'Z') {
                 sum += ch - 'A';
             }
        }
        return sum;
    }
    private static boolean compareStr(String s1,String s2,String target){
        if ((StringValue(s1) +StringValue(s2) ) == StringValue(target)){
             return true;
        }else {
             return false;
        }
    }
}
    