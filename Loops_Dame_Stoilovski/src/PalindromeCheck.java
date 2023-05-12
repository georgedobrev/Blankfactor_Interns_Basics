public class PalindromeCheck {
    public boolean CheckForPalindrome(String str){
        boolean palindromeFound = true;

        for (int i = 0; i < str.length()/2; i++){

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                palindromeFound = false;
                break;
            }
        }
        return palindromeFound;
    }
}
