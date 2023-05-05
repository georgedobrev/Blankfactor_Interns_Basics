import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2, 3);
        stringList.add(0, "First element");
        stringList.add(1, "Second element");
        stringList.add(2, "Third element");

        System.out.println("----Integer List----");
        for(int i = 0; i < integerList.size(); i++){
            System.out.println("(" + i + ") " + integerList.get(i));
        }
        System.out.println("----String List----");
        for(int i = 0; i < stringList.size(); i++){
            System.out.println("(" + i + ") " + stringList.get(i));
        }

        swapGeneric(integerList,1,2);
        swapGeneric(stringList,1,2);

        System.out.println("----Swapped Integer List----");
        for(int i = 0; i < integerList.size(); i++){
            System.out.println("(" + i + ") " + integerList.get(i));
        }
        System.out.println("----Swapped String List----");
        for(int i = 0; i < stringList.size(); i++){
            System.out.println("(" + i + ") " + stringList.get(i));
        }
    }

    public static <T> void swapGeneric(List<T> list, int index1, int index2){
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}