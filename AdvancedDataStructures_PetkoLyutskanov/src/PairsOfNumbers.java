import java.util.*;
import java.util.stream.Collectors;

public class PairsOfNumbers {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        List<Integer> numsAsList = Arrays.stream(nums).boxed().toList();
        int target = 7;

        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < numsAsList.size(); i++) {
            int difference = target - numsAsList.get(i);

            if (numsAsList.contains(difference)) {
                if (!numsMap.containsKey(difference)) {
                    numsMap.put(numsAsList.get(i), difference);
                }
            }
        }

        for (Map.Entry<Integer, Integer> set : numsMap.entrySet()) {
                System.out.print("(" + set.getKey() + ", "
                        + set.getValue() + ")");
        }
    }
}