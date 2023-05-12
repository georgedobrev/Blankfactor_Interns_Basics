import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 7;
        pairTargetSum(arr, target);
    }

    private static void pairTargetSum(int[] arr, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int difference = target - arr[i];
            if (hMap.containsValue(difference)) {
                System.out.println("[" + arr[i] + ", " + difference + "]");
            }
            hMap.put(i, arr[i]);
        }
    }
}