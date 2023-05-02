package advancedDataStructures;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int target = 7;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int number = num[i];
            map.put(number, i);
        }

        for (int i = 0; i < num.length; i++) {
            int n = target - num[i];
            if (map.containsKey(n) && map.get(n) != i) {
                System.out.println("(" + num[i] + ", " + n + ")");
            }
        }
    }
}
