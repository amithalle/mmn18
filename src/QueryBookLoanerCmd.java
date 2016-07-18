/**
 * Created by amit on 18/07/16.
 */
public class QueryBookLoanerCmd extends Command {
    private Book book;

    public QueryBookLoanerCmd(Book book) {
        this.book = book;
    }

    @Override
    public boolean act() {
        return false;
    }
}
