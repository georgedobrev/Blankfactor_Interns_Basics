import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MostCommonWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "The quick brown fox jumped over the lazy dog. The lazy dog slept all day.";
        sentence = removePunctuations(sentence); //removing punctuation
        String[] words = sentence.split(" ");

        HashMap<String, Integer> commonWord = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        for (int i = 0; i < words.length; i++) {

            if(commonWord.containsKey(words[i]))
            {
                commonWord.put(words[i], commonWord.get(words[i]) + 1);

            } else
            {
                commonWord.put(words[i],1);
            }
        }


        Map.Entry<String,Integer> maxCount = null;

        for ( Map.Entry<String, Integer> entry : commonWord.entrySet()) {

            if (maxCount == null || entry.getValue().compareTo(maxCount.getValue()) > 0)
            {
                maxCount = entry;
            }
        }
        System.out.printf("The most common word is: \"%s\"\n", maxCount.getKey());

    }
    public static String removePunctuations(String sentence)
    {
        return sentence.replaceAll("\\p{IsPunctuation}", "");
    }
}