import java.util.HashMap;
import java.util.Map;

public class CountNamesInArray {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie","Alice", "Bob", "David"};

        Map<String, Integer> namesCount = new HashMap<>();

        int repeated = 0;

        for (int i = 0; i < names.length; i++) {
            if(namesCount.containsKey(names[i]))
            {
                namesCount.put(names[i], namesCount.get(names[i]) + 1);

            } else
            {
                namesCount.put(names[i], 1);

            }
        }

        for (Map.Entry<String, Integer> entry : namesCount.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}