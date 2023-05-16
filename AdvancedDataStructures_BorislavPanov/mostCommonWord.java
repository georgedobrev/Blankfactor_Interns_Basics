import java.util.HashMap;
import java.util.Map;

public class mostCommonWord {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        Map.Entry<String,Integer> mostCommonWord = null;
        String sentence = "The quick brown fox jumped over the lazy dog. The lazy dog slept all day.";
        sentence = sentence.replaceAll("\\p{Punct}", "");
        sentence = sentence.toLowerCase();
        String[] arraySentence = sentence.split(" ");


        for (String name: arraySentence) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        for(Map.Entry<String,Integer> max:map.entrySet())
        {
            if (mostCommonWord == null || max.getValue().compareTo(mostCommonWord.getValue()) > 0)
            {
                mostCommonWord = max;
            }
        }
        System.out.println("\"" + mostCommonWord.getKey() + "\"" + " " + "(appears " + mostCommonWord.getValue() + " times)");
    }
}
