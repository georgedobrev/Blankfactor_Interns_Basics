import java.util.ArrayList;
import java.util.List;

public class geneticTask {

    public static <T> void receiveList(List<T> list, int firstIndex, int secondIndex) {
        T temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
        for (T item : list) {
            System.out.println(item.toString());
        }
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("a", "b" , "c"));
        receiveList(list1, 0,   1);
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3));
        receiveList(list2, 0, 2);
    }
}
