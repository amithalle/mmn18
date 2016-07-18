/**
 * Created by amit on 18/07/16.
 */
public class ReturnBookCmd extends Command {
    private Book book;
    private Person person;

    public ReturnBookCmd(Book book, Person person) {
        this.book = book;
        this.person = person;
    }


    @Override
    public boolean act() {
        return false;
    }
}
