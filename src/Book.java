/**
 * Created by amit on 18/07/16.
 */
public class Book implements Comparable<Book> {
    private String ID;
    private Member Loaner;

    public Book(String id, Member loaner) {
        ID = id;
        this.Loaner = loaner;
    }

    @Override
    public int compareTo(Book book) {
        return 0;
    }

    public String getID() {
        return ID;
    }

    public Member getLoaner() {
        return Loaner;
    }
}
