public class CheckTheSum {
    public boolean TwoStringsEqualsThird(String first, String second, String third){
        return GetSumOfAString(first) + GetSumOfAString(second) == GetSumOfAString(third);
    }

    private int GetSumOfAString(String str){
        int sumOfTheWord = 0;
        char[] charArray = str.toCharArray();
        for (char c : charArray){
            sumOfTheWord += (int) c - 96;
        }
        return sumOfTheWord;
    }
}
