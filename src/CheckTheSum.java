public class CheckTheSum {

    public boolean checkTheSum(String word1, String word2, String target) {
        boolean result = false;
        int sumWords = 0;
        int sumTarget = 0;
        for (int i = 0; i < word1.length(); i++) {
            sumWords = sumWords + (int) word1.charAt(i) - 97;

        }

        for (int i = 0; i < word2.length(); i++) {
            sumWords = sumWords + (int) word2.charAt(i) - 97;

        }

        for (int i = 0; i < target.length(); i++) {
            sumTarget = sumTarget + (int) target.charAt(i) - 97;

        }
        if (sumTarget == sumWords) {

            result = true;

        }

        return result;

    }
}
