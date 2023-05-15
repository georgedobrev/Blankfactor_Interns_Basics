public class MergeTwoStrings {
    static void mergeAndPrint() {
        String word1 = "abc";
        String word2 = "fasdfas";
        StringBuilder merged = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                merged.append(word2.charAt(i));
            }
        }
        System.out.println(merged);
    }

    public static void main(String[] args) {
        mergeAndPrint();
    }
}








