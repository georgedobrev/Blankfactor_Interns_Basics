import java.util.List;

public class SwapItems {
    public static <T> void SwapList(List<T> list, int index1, int index2) {
        T tempList = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tempList);
    }
}
