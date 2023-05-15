import java.util.HashMap;
import java.util.Map;
public class MostCommonWord {
    public static void main(String[] args) {
        String input = "The quick brown fox jumped over the lazy dog.The lazy dog slept all day.";
        Map<String,Integer>wordCounts = new HashMap<String,Integer>();

        String cleanInput = input.replaceAll("[^a-zA-Z]","").toLowerCase();
        String[] words = cleanInput.split("\\s+");

        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word,1);
            }
        }
        String mostCommonWord = null;
        int maxCount = 0;
        for (Map.Entry<String,Integer>entry:wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("The most common word is \"" + mostCommonWord + "\",which appears" +maxCount +"times");
    }
}
