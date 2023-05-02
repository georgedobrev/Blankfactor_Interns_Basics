public class IsPalindrome {
    public static boolean isPalindrome(int num) {
        int duplicateNum = num;
        int reverse = 0;

        while (duplicateNum > 0) {
            int remainder = duplicateNum % 10;
            reverse = reverse * 10 + remainder;
            duplicateNum /= 10;
        }

        if (num == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 131;

        System.out.println(isPalindrome(num));
    }
}
