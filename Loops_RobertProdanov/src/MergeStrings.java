import java.util.Scanner;

public class MergeStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word1 = input.nextLine();

        String word2 =  input.nextLine();

        System.out.println(merge(word1, word2));
    }

    public static String merge(String word1, String word2) {

        String[] s1 = word1.split("");

        String[] s2 = word2.split("");

        String res = "";

        int i = 0, j = 0;

        while (i < s1.length && j < s2.length) {
            res = res + s1[i++] + s2[j++];
        }

        while (i < s1.length) {
            res = res + s1[i++];
        }

        while (j < s2.length) {
            res = res + s2[j++];
        }

        return res;
    }

}

//2ro resheniee
/*

import java.util.Scanner;

public class MergeStrings {

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       String s1 = input.nextLine();

       String s2 = input.nextLine();

       System.out.print(stringMerger(s1,s2));

   }

    static String stringMerger(String s1, String s2) {

       String[] str1 = s1.split("");

       String[] str2 = s2.split("");

       String result= "";

       for(int i =0; i < str1.length;i++){
           result = result + str1[i] + str2[i];

       }
       return result;
   }
}
*/

