import java.util.Scanner;

public class P02MergeTwoFiles {


    public static void main(String[] args) {
        System.out.println(mergeStrings("abc", "pqr"));
    }

    public static String mergeStrings(String word, String word2){

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < word.length() || i < word2.length(); i++) {
            if(i < word.length())
                result.append(word.charAt(i));

            if(i < word2.length())
                result.append(word2.charAt(i));
        }
        return result.toString();
    }
}
