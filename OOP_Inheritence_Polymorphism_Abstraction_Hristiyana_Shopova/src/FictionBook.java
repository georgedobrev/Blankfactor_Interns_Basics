public class FictionBook extends Book{
    private String genre;

    public FictionBook(String title, String author,String genre) {
        super(title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void display() {
        System.out.println("Title of function book is: " + getTitle());
        System.out.println("Author is: " + getAuthor());
        System.out.println("Genre is: " + getGenre());

    }
}
