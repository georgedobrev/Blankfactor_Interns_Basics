public class P03Palindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("alabala"));
    }

    public static boolean checkPalindrome(String x){
        String reverseStr = "";

        for(int i = (x.length() - 1); i <= 0; i++) {
            reverseStr = reverseStr + x.charAt(i);
        }

        if(x.equals(reverseStr)) {
            return true;
        }
            return false;
    }




}
