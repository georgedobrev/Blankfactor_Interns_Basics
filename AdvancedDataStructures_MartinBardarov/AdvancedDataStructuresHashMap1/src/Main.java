import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        String word = "The quick brown fox jumped over the lazy dog. The lazy dog slept all day.";

        String result = mostCommonWord(word);
        System.out.println(result);
    }


    public static String mostCommonWord(String word) {
        HashMap<String, Integer> wordsCounter = new HashMap<>();

        String cleanText = word.replaceAll("\\p{Punct}", "");
        cleanText = cleanText.toLowerCase();
        String[] splitWord = cleanText.split(" ");

        for (String iterator : splitWord) {
            if (!wordsCounter.containsKey(iterator)) {
                wordsCounter.put(iterator, 1);
            } else {
                wordsCounter.put(iterator, wordsCounter.get(iterator) + 1);
            }

        }
        System.out.println(wordsCounter);
        String wordWithMaxCount = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordsCounter.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                wordWithMaxCount = entry.getKey();
            }
        }

        return wordWithMaxCount;

    }


}

