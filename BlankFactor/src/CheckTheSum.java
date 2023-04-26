public class CheckTheSum {
    //Check the sum
//Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
//Output: true
        public static int getValue(String word) {
            int value = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                value = value * 10 + (c - 'a');
            }
            return value;
        }
        public static void main(String[] args) {
            String firstWord = "acb";
            String secondWord = "cba";
            String targetWord = "cdb";

            int firstWordValue = getValue(firstWord);
            int secondWordValue = getValue(secondWord);
            int targetWordValue = getValue(targetWord);

            boolean areEqual = (firstWordValue + secondWordValue) == targetWordValue;

            System.out.println(areEqual);
        }


    }

