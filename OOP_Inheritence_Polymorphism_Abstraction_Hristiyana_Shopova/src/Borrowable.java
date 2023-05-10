import java.util.Date;

public interface Borrowable {
    void borrow(String borrowerName);
    void returnItem();
    boolean isBorrowed();
    String getBorrower();
    Date getDueDate();
    boolean isOverdue();
}
