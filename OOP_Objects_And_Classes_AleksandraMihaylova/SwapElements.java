package oopObjectsAndClasses;
import java.util.ArrayList;
import java.util.List;
public class SwapElements {
    public static <T> void swapElements(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args) {
        List<Integer> intList =new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Original given list: " + intList);
        swapElements(intList, 1, 3);
        System.out.println("List after swapping: " + intList);
    }
}