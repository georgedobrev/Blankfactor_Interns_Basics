public class NonFictionalBook extends Book{
    private String topic;
    public NonFictionalBook(String title, String author, String topic)
    {
        super(title,author);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public void display() {
        System.out.println("Title of non-functional book is: " + getTitle());
        System.out.println("Author is: " + getAuthor());
        System.out.println("Topic is: " + getTopic());
    }
}
