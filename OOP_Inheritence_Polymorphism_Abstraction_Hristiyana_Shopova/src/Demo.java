import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        FictionBook book = new FictionBook("Harry Potter Pt.1", "J.K.Rowling", "drama");
        NonFictionalBook nonFicBook = new NonFictionalBook("Documentary", "Anonym", "science");
        ReferenceBook referenceBook = new ReferenceBook("Dictionary", "PONS", "German - English");

        LibraryItem item1 = new LibraryItem("1984", "George Orwell");
        LibraryItem item2 = new LibraryItem("1989", "George Orwell2");
        LibraryItem item3 = new LibraryItem("Dictionary", "George Orwell2");

        List<LibraryItem> items = new LinkedList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        for (int i = 0; i < items.size(); i++) {
            if(items.contains(referenceBook))
            {
                System.out.println(items.get(i).getTitle());

            } else
            {
                System.out.println("This book doesn't exist in Library.");
            }
        }
    }
}
