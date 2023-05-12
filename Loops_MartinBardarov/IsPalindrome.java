public class IsPalindrome {

    public boolean isPalindrome(String word) {
        boolean reversed = false;
        StringBuilder input1 = new StringBuilder();
        input1.append(word);
        input1.reverse();
        if (input1.toString().equals(word)) {
            reversed = true;
        }
        return reversed;
    }

    public boolean isPalindromeInteger(int number){
        boolean reversed = false;
        StringBuilder input1 = new StringBuilder();
        String reversedNum= Integer.toString(number);
        for(int i=reversedNum.length()-1;i>=0;i--) {
            input1.append(reversedNum.charAt(i));
        }
        System.out.println(input1);
        System.out.println(reversedNum);
            if (input1.toString().equals(reversedNum)){
                reversed=true;
        }
            return reversed;
    }
}
