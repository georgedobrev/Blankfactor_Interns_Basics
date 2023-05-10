import java.util.Date;

public class DateModifier {

    private Date date1;
    private Date date2;


    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public long dateDiff(Date date1, Date date2) {
        long dateDiff = date1.getTime() - date2.getTime();
        dateDiff = dateDiff / (24 * 60 * 60 * 1000);

        return dateDiff;
    }

}
