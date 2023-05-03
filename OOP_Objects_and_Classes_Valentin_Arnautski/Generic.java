import java.util.ArrayList;
import java.util.List;

public final class Generic {

    public static <T> void swapElements(List<T> list, int index1, int index2) {
        T el1 = list.get(index1);
        T el2 = list.get(index2);
        list.set(index1, el2);
        list.set(index2, el1);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Yes");
        list.add("No");
        list.add("2");
        list.add("8");

        System.out.println(list);
        swapElements(list, 1, 3);
        System.out.println(list);
    }
}