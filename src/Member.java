import java.util.LinkedList;

/**
 * Created by amit on 18/07/16.
 */
public class Member implements Comparable<Member> {
    private long ID;
    private String name;

    private LinkedList<Book> Books;

    public Member(long ID, String name) {
        this.ID = ID;
        this.name = name;
        this.Books = new LinkedList<Book>();
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Member member) {
        return 0;
    }

    public LinkedList<Book> getBooks() {
        return Books;
    }
}
