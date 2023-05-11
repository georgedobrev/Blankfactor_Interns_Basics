import java.util.ArrayList;
import java.util.List;

public class P03SwapElements {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        swapElements(numbersList, 0, 2);

        List<String> wordList = new ArrayList<>();
        wordList.add("second word");
        wordList.add("first word");
        swapElements(wordList, 0, 1); // swap the first and second elements


    }
    public static <T> void swapElements(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

}
