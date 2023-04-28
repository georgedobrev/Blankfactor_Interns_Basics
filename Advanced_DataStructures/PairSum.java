import java.util.*;

public class PairSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 7;
        List<List<Integer>> pairs = findPairs(nums, target);
        System.out.println("Pairs that sum to " + target + ": " + pairs);
    }

    public static List<List<Integer>> findPairs(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) {
                int j = complementMap.get(complement);
                pairs.add(Arrays.asList(nums[i], nums[j]));
            }
            complementMap.put(nums[i], i);
        }

        return pairs;
    }
}
