import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Printer {
    Scanner scanner = new Scanner(System.in);
    public int loadLists(){
        System.out.println("Enter the number of Paper lists!!");
       int numberOfLists= scanner.nextInt();
       return numberOfLists;
    }
    public Stack<Integer> addPaper(int numberOfLists) {

        Stack <Integer>loadedLists = new Stack<>();
        System.out.println("Please choose 0 for plain paper or 1 for glossy paper!");

        for (int i = 0; i < numberOfLists; i++) {
            int list = scanner.nextInt();
            while (list != 1 && list != 0){
                System.out.println("Please choose a valid paper type");
                list=scanner.nextInt();
            }
            loadedLists.push(list);
        }

        return loadedLists;
    }


}

