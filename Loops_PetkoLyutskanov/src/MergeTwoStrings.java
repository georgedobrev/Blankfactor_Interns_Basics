public class MergeTwoStrings {
    public static String mergeTwoStrings(String arr1, String arr2) {
        int minArrLength = Math.min(arr1.length(), arr2.length());
        int difference = Math.abs(arr1.length() - arr2.length());
        String result = "";

        for (int i = 0; i < minArrLength; i++) {
            result += arr1.charAt(i);
            result += arr2.charAt(i);
        }

        if (difference != 0 && arr1.length() > arr2.length()) {
            for (int i = arr2.length(); i < arr1.length(); i++) {
                result += arr1.charAt(i);
            }
        } else {
            for (int i = arr1.length(); i < arr2.length(); i++) {
                result += arr2.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String arr1 = "abc";
        String arr2 = "pqr";

        String result = mergeTwoStrings(arr1, arr2);

        System.out.println(result);
    }
}