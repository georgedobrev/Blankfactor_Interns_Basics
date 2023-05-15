import java.util.*;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int target = 7;
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        HashMap<Integer, Integer> result = sumsToTarget(nums, target);
        for (HashMap.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.print(entry.getKey() + "," + entry.getValue() + " ");

        }
    }

    public static HashMap<Integer, Integer> sumsToTarget(ArrayList<Integer> nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i : nums) {
            int pair = target - i;
            if (nums.contains(pair) && !result.containsKey(i)) {
                result.put(pair, i);

            }

        }
        return result;
    }
}