import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string that you want to check: ");
        String input = scanner.nextLine();
        mostCommonWord(input);
    }

    public static void mostCommonWord(String input){
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = input.toLowerCase().replaceAll("[^\\w\\s]", "").split("\\s+");
        for(String word : words){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        int maxCount = 0;
        String mostCommonWord = "";
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostCommonWord = entry.getKey();
            }
        }
        System.out.printf("The most common word is: " + mostCommonWord + " (appears %d times)", maxCount);
    }
}