public class MergeTwoStrings {
    private static  void merging() {
      String word1 = "312312";
      String word2 = "kfsf";
        if (word1.length() > word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                System.out.print(word1.charAt(i % word1.length()));
                System.out.print(word2.charAt(i % word2.length()));
            }
        } else {
            for (int i = 0; i < word2.length(); i++) {
                System.out.print(word1.charAt(i % word1.length()));
                System.out.print(word2.charAt(i % word2.length()));
            }
        }
    }
    public static void main(String[] args) {
        merging();
    }
}








