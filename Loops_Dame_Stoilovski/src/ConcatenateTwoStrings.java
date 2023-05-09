import java.util.ArrayList;

public class ConcatenateTwoStrings {
    public String mergeTwoStrings(String firstString, String secondString) {

        ArrayList<Character> result = new ArrayList<>();
        int shorterString = Math.min(firstString.length(), secondString.length());
        for (int i = 0; i < shorterString; i++) {
            result.add(firstString.charAt(i));
            result.add(secondString.charAt(i));
        }

        if (firstString.length() > secondString.length()) {
            addTheAdditionalCharacters(result, secondString, firstString);
        } else {
                addTheAdditionalCharacters(result, firstString, secondString);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : result) {
            sb.append(c);
        }
        return sb.toString();
    }
    private void addTheAdditionalCharacters(ArrayList<Character> result, String first, String second){
        for (int i = first.length(); i < second.length(); i++) {
            result.add(second.charAt(i));
        }
    }
}
