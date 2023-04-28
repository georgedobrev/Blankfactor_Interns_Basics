import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostCommonWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String[] words = str.split("\\W+");

        Map<String, Integer> namesCount = new HashMap<>();

        for (int i = 0; i <words.length ; i++) {
            if(namesCount.containsKey(words[i])){
                namesCount.put(words[i], namesCount.get(words[i]) + 1);
            }else {
                namesCount.put(words[i], 1);
            }
        }

        String key = Collections.max(namesCount.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.print(key +": " + namesCount.get(key));
    }
}
