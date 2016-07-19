/**
 * Created by amit on 18/07/16.
 */
public class QueryBookLoanerCmd extends Command {
    private String bookId;

    public QueryBookLoanerCmd(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean act() {
        Book b = Library.getInstance().getBooks().search(this.bookId);
        System.out.println("Book " + b.toString() + " is loaned by member: " + b.getLoaner().toString());
        return true;
    }
}
