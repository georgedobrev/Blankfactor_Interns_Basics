import com.sun.source.tree.ReturnTree;

public class MergeTwoStrings {
    public String mergeTwoString(String string1, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        final int shortestWord = Math.min(string1.length(), string2.length());

        for (int i = 0; i < shortestWord; ++i) {
            stringBuilder.append(string1.charAt(i));
            stringBuilder.append(string2.charAt(i));
        }

        return stringBuilder.append(string1.substring(shortestWord)).append(string2.substring(shortestWord)).toString();

    }

}


