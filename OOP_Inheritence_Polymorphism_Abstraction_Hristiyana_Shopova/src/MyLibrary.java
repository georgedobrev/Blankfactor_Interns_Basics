import java.util.LinkedList;
import java.util.List;

public class MyLibrary implements Library{
    private List<Book> books;
    public MyLibrary()
    {
        this.books = new LinkedList<>();
    }

    @Override
    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        this.books.remove(book);
    }

    @Override
    public Book findBook(String title) {

        for(Book book: this.books)
        {
            if(book.getTitle().equals(title))
            {
                return book;
            }
        }
        return null;
    }
}
