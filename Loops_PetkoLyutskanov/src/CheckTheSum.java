import java.util.HashMap;

public class CheckTheSum {
    public static boolean meetsTheTarget(String firstWord, String secondWord, String targetWord) {
        HashMap<Character, Integer> charValuesMap = new HashMap<>();

        int value = 0;
        int firstWordSum = 0;
        int secondWordSum = 0;
        int targetWordSum = 0;

        for (char ch = 'a'; ch <= 'z'; ++ch) {
            charValuesMap.put(ch, value);
            value++;
        }

        for (int i = 0; i < firstWord.length(); i++) {
            firstWordSum += charValuesMap.get(firstWord.charAt(i));
            secondWordSum += charValuesMap.get(secondWord.charAt(i));
            targetWordSum += charValuesMap.get(targetWord.charAt(i));
        }

        if (firstWordSum == secondWordSum && firstWordSum + secondWordSum == targetWordSum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";

        System.out.println(meetsTheTarget(firstWord, secondWord, targetWord));
    }
}
