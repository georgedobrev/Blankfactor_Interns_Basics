import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //DateModifier

        System.out.println("Difference between dates:");
        System.out.println( DateModifier.daysBetweenDates("2022-10-10","2022-10-07"));
        System.out.println( DateModifier.daysBetweenDates("2022-10-10","2022-10-15"));

        Family f  = new Family();
        System.out.println("\nEnter amount of family numbers");

        int members = input.nextInt();
        createMembers(members,f);
        System.out.println(f.GetOldestMember());

        //Generic method

        //list with strings
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");

        swapElements(list, 1,2);
        System.out.println(list);

        //list with integers
        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(1);
        list2.add(2);
        list2.add(3);

        swapElements(list2, 1,2);
        System.out.println(list2);
    }

    private static void createMembers(int members, Family f){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < members ; i++) {
            System.out.println("Enter member name: ");
            String name = input.nextLine();

            System.out.println("Enter member age: ");
            int age = input.nextInt();

            input.nextLine();

            f.addMember( new Person(name, age));

        }
    }


    public static <T> void swapElements(List<T> list, int idx1, int idx2) {

        if(idx1 < list.size() && idx2 < list.size()) {
            Collections.swap(list, idx1, idx2);
        }
    }

}