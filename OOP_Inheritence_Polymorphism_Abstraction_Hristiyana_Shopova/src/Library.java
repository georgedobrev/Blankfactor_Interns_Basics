public interface Library {
    void removeBook(Book book);
    void addBook(Book book);
    Book findBook(String title);
}
