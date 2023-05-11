import java.util.*;

public class MostCommonWordFinder {
    public void mostCommonWordFinder(String word) {
        String[] wordArray = word.split(" ");
        Map<String, Integer> wordsWithCounter = new HashMap<>();

        for (String name : wordArray) {
            name = name.toLowerCase();
            if (wordsWithCounter.containsKey(name)) {
                int currentValue = wordsWithCounter.get(name);
                wordsWithCounter.put(name, currentValue + 1);
            } else {
                wordsWithCounter.put(name, 1);
            }
        }

        String keyWithMaxValue = Collections.max(wordsWithCounter.entrySet(), Map.Entry.comparingByValue()).getKey();
        printFunc(wordsWithCounter, keyWithMaxValue);
    }

    public void printFunc(Map<String, Integer> wordsWithCounter, String word) {
        System.out.println("The most common word in the given string is: " + word);
        System.out.println("The word appears " + wordsWithCounter.get(word) + " times");
    }
}
