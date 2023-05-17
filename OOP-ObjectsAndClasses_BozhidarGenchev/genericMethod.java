import java.util.List;

public class Main {
    public static <T> void swapElements(List<T> list, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= list.size() || index2 >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        System.out.println("Before swap: " + list1);
        swapElements(list1, 1, 3);
        System.out.println("After swap: " + list1); 

        List<String> list2 = List.of("apple", "banana", "cherry");
        System.out.println("Before swap: " + list2); 
        swapElements(list2, 0, 2);
        System.out.println("After swap: " + list2); 
    }
}
