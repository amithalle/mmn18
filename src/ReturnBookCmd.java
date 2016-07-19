/**
 * Created by amit on 18/07/16.
 */
public class ReturnBookCmd extends Command {
    private long memberID;
    private String bookId;

    public ReturnBookCmd(long memberID, String bookId) {
        this.memberID = memberID;
        this.bookId = bookId;
    }


    @Override
    public boolean act() {
        Book b = Library.getInstance().getBooks().search(this.bookId);
        Member m = Library.getInstance().getMembers().search(this.memberID);
        m.getBooks().removeFirstOccurrence(b);
        Library.getInstance().getBooks().delete(this.bookId);
        Library.getInstance().getMembersByLoans()[m.getBooks().size() + 1].delete(this.memberID);
        Library.getInstance().getMembersByLoans()[m.getBooks().size()].insert(this.memberID, m);

        return true;
    }
}
