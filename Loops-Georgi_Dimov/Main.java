import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("\tTask 1:");
        System.out.println(mergeTwoStrings("abc","pqr") + "\n");
        System.out.println("\tTask 2:");
        System.out.println(palindromeCheck(1221) + "\n");
        System.out.println("\tTask 3:");
        System.out.println(FizzBuzzMethod(15) + "\n");
        System.out.println("\tTask 4:");
        System.out.println(checkTheSum("acb","cba","cdb"));
    }



    public static List<String> FizzBuzzMethod(int x) {
        List<String> FizzBuzz = new ArrayList<String>();
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                FizzBuzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                FizzBuzz.add("Fizz");
            } else if (i % 5 == 0) {
                FizzBuzz.add("Buzz");
            } else {
                FizzBuzz.add(String.valueOf(i));
            }
        }
        return FizzBuzz;
    }

    public static String mergeTwoStrings(String a, String b){
        StringBuilder output = new StringBuilder();
        int i = 0;
        while(i < a.length() || i < b.length()){
            if(i < a.length()){
                output.append(a.charAt(i));
            }
            if(i < b.length()){
                output.append(b.charAt(i));
            }
            i++;
        }

        return output.toString();
    }

    public static boolean checkTheSum(String firstWord, String secondWord, String targetWord){
        int sum1 = 0;
        for(int i = 0; i < firstWord.length(); i++){
            sum1 = sum1 + (firstWord.charAt(i)-97);
        }
        System.out.println("Sum1=" + sum1);
        int sum2 = 0;
        for(int i = 0; i < secondWord.length(); i++){
            sum2 = sum2+ (secondWord.charAt(i)-97);
        }
        System.out.println("Sum2=" + sum2);
        int sumTarget = 0;
        for(int i = 0; i < targetWord.length(); i++){
            sumTarget = sumTarget + (targetWord.charAt(i)-97);
        }
        System.out.println("SumTarget=" + sumTarget);
        return sum1 + sum2 == sumTarget;
    }

    public static boolean palindromeCheck(int num){
        String sNum = String.valueOf(num);
        int i = 0;
        int j = sNum.length()-1;
        while(i <= j) {
            if (sNum.charAt(i) != sNum.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}