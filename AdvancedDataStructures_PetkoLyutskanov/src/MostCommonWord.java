import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

    public static void main(String[] args) {
        String input = "The quick brown fox jumped over the lazy dog. The lazy dog slept all day.";
        String[] inputArray = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        HashMap<String, Integer> countOfOccurrencesMap = new HashMap<>();

        for (String word : inputArray) {
            if (!countOfOccurrencesMap.containsKey(word)) {
                countOfOccurrencesMap.put(word, 1);
            } else {
                countOfOccurrencesMap.put(word, countOfOccurrencesMap.get(word) + 1);
            }
        }

        int maxValueInMap = (Collections.max(countOfOccurrencesMap.values()));

        for (Map.Entry<String, Integer> set : countOfOccurrencesMap.entrySet()) {
            if (set.getValue() == maxValueInMap) {
                System.out.println(set.getKey());
            }
        }
    }
}
