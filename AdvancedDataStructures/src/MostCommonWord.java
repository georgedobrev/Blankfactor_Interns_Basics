import java.util.*;


public class MostCommonWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(mostCommonWord(str));

    }

    private static String mostCommonWord(String str){
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

        return key +": " + namesCount.get(key);
    }
}
