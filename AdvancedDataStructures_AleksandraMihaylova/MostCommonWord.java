package advancedDataStructures;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {

        String abc = "The quick brown fox jumped over the lazy dog. The lazy dog slept all day.";
        abc = abc.replaceAll("[^a-zA-Z0-9 ]", "").strip().toLowerCase();

        System.out.println(abc);

        String[] words = abc.split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        String mostCommonWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommonWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        System.out.println("Most common word: " + mostCommonWord + " (appears " + maxFrequency + " times)");

    }
}