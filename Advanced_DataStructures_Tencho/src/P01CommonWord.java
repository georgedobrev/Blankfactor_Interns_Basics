import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class P01CommonWord {


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //The quick brown fox jumped over the lazy dog. The dog, startled, barked loudly.
        String input = scanner.nextLine();
        String mostCommon = wordScanner(input);
        System.out.println(mostCommon);
    }

    public static String wordScanner (String word){

        word = word.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] sentence = word.split("\\s+");

        HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();

        for (String element : sentence) {
            if (wordCounts.containsKey(element)) {
                wordCounts.put(element, wordCounts.get(element) + 1);
            } else {
                wordCounts.put(element, 1);
            }
        }
        int maxCount = 0;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        return maxWord;
    }
}
