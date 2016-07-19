/**
 * Created by amit on 18/07/16.
 */
public class LoanBookCmd extends Command {
    private long memberID;
    private String bookId;

    public LoanBookCmd(long memberID, String bookId) {
        this.memberID = memberID;
        this.bookId = bookId;
    }

    @Override
    public boolean act() {
        Member m = Library.getInstance().getMembers().search(this.memberID);
        Book b = new Book(this.bookId, m);
        Library.getInstance().getBooks().insert(this.bookId, b);
        Library.getInstance().getMembersByLoans()[m.getBooks().size()].delete(this.memberID);
        Library.getInstance().getMembersByLoans()[m.getBooks().size() + 1].insert(this.memberID, m);
        m.getBooks().add(b);

        return true;
    }
}
