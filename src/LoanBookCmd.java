/**
 * Created by amit on 18/07/16.
 */
public class LoanBookCmd extends Command {
    private Person person;
    private Book book;

    public LoanBookCmd(Person person, Book book) {
        this.person = person;
        this.book = book;
    }

    @Override
    public boolean act() {
        return false;
    }
}
