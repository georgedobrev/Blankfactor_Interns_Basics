import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class pairOfNumbers {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();

        int[] array = {1,2,3,4,5};
        int target = 7;

        for (int i = 0; i < array.length; i++) {
            int difference = target - array[i];
            if (map.containsKey(difference)) {
                int index = map.get(difference);
                list.add(array[index]);
                list.add(array[i]);
            }
            map.put(array[i], i);
        }

        for (int i = list.size()-1; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.print("(" + list.get(i-1) + ", " + list.get(i) + ")");
                if (i != 1) {
                    System.out.print(", ");
                }
            }
        }

    }
}