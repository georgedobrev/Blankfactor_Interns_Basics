import java.util.*;

public class PairsOfNumbers {
    public static void main(String[] args) {

        int[] arr = {6, 8, 4, 5, 9};

        int target = 14;

        pairs(arr, target);
    }

    private static void pairs(int[] arr, int target) {

        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int check = target - arr[i];

            if (numbers.containsValue(check)) {
                System.out.println(arr[i] + "," + check);
            }
            numbers.put(i, arr[i]);
        }
    }
}

