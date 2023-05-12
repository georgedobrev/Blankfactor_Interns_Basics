public class ReferenceBook extends Book{
    private String category;

    public ReferenceBook(String title, String author, String category)
    {
        super(title, author);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    @Override
    public void display() {
        System.out.println(" Title of reference book is: " + getTitle());
        System.out.println(" Title of reference book is: " + getTitle());
        System.out.println(" Title of reference book is: " + getTitle());
        System.out.println(" Title of reference book is: " + getCategory());
    }
}
