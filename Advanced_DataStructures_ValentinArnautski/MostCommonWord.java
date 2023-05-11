import java.util.*;

public class MostCommonWord {

    public static void main(String[] args) {
        String input = "The quick brown fox jumped over the lazy dog. The lazy dog slept all day.";
        String mostCommonWord = findMostCommonWord(input);
        System.out.println("Most common word: " + mostCommonWord);
    }

    public static String findMostCommonWord(String input) {

        input = input.toLowerCase();

        String[] words = input.split("\\s+");

        // Create a HashMap to store how many times the word appears
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Count
        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }

        // Find the most common word
        String mostCommonWord = "";
        int maxFrequency = 0;
        for (String word : wordFrequency.keySet()) {
            int frequency = wordFrequency.get(word);
            if (frequency > maxFrequency) {
                mostCommonWord = word;
                maxFrequency = frequency;
            }
        }

        return mostCommonWord;
    }
}