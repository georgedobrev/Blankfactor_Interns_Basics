import java.util.Date;

public class LibraryItem implements Borrowable{
    private String title;
    private String author;
    private String borrower;
    private Date dueDate;

    public LibraryItem(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void borrow(String borrowerName) {
        borrower = borrowerName;
        dueDate = new Date(System.currentTimeMillis() + (7 * 24 * 60 * 60 * 1000)); //7 days in milliseconds
        System.out.println("Item borrrowed by: " + borrowerName);
    }

    @Override
    public void returnItem() {
        borrower = null;
        dueDate = null;
        System.out.println("Item returned.");
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public boolean isBorrowed() {
        return borrower != null;
    }

    @Override
    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public boolean isOverdue() {
        if(dueDate == null)
        {return false;}
        return System.currentTimeMillis() > dueDate.getTime();

    }
}
