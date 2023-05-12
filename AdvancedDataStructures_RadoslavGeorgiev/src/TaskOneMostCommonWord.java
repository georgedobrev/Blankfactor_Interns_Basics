import java.util.*;
//Write a program that takes a string as input and outputs the most common word in the string.
// Ignore case and punctuation.
//
//Example input: "The quick brown fox jumped over the lazy dog. The lazy dog slept all day."
//Example output: "the" (appears 3 times)
public class TaskOneMostCommonWord {
    private static  void mostCommonWords() {
        String input = "The quick brown fox jumped over the lazy dog. The lazy dog slept all day.";
        String[] words = input.toLowerCase().split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        String mostCommonWord = "";
        int maxCount = 0;
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            if (count > maxCount) {
                mostCommonWord = word;
                maxCount = count;
            }
        }


        System.out.println(mostCommonWord);
    }



    public static void main(String[] args) {
   mostCommonWords();
    }
}