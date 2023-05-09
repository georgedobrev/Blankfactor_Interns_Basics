public class P04CheckTheSum {

    public static void main(String[] args) {
        System.out.println(checker("acb","cba","cdb"));

    }

    public static boolean checker(String firstStr, String secondStr, String finalStr){
        return (makeCalculations(firstStr) + makeCalculations(secondStr)) == makeCalculations(finalStr);
    }

    public static int makeCalculations(String word){
        int wordScore = 0;

        for(int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            wordScore += (int) x - 97;
        }
        return wordScore;
    }
}
