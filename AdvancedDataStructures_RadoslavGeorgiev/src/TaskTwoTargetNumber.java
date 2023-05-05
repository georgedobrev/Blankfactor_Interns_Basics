import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Write a program that takes an array of integers and a target integer,
// and outputs all pairs of numbers in the array that sum to the target.
//
//Example input: [1, 2, 3, 4, 5], 7
//Example output: (2, 5), (3, 4)
public class TaskTwoTargetNumber {
    private static List<String> findPairs(int[] numbers, int target1) {
        List<String> pairs = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            int target2 = target1 - num;
            if (set.contains(target2)) {
                pairs.add("(" + target2 + ", " + num + ")");
            }
            set.add(num);
        }
        return pairs;
    }
public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target1 = 7;
        List<String> pairs = findPairs(numbers, target1);
        for (String pair : pairs) {
        System.out.println(pair);
        }
        }


}

