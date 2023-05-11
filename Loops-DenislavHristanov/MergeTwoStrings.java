public class MergeTwoStrings {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        StringBuilder result = new StringBuilder();
        int length = Math.max(word1.length(),word2.length());

        for (int i = 0; i < length;i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));

            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));

            }
        }
        System.out.println(result.toString());

    }

}
