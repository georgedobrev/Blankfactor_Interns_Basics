import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfPairsOfNumbers {
    public void filterAndFindSumOfPairs(ArrayList<Integer> numbers, int target) {
        Map<Integer, Integer> pairsOfNums = new HashMap<>();

        for (int i : numbers) {
            int result = target - i;
            if (!pairsOfNums.containsKey(i) && numbers.contains(result)) {
                pairsOfNums.put(result, i);
            }
        }
        printValues(pairsOfNums);
    }

    private void printValues(Map<Integer, Integer> pairsOfNums) {
        for (var entry: pairsOfNums.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            System.out.printf("(%d, %d) ", key, val);
        }
    }
}
