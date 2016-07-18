/**
 * Created by amit on 18/07/16.
 */
public class QueryPersonLoansCmd extends Command {
    private Person person;

    public QueryPersonLoansCmd(Person person) {
        this.person = person;
    }

    @Override
    public boolean act() {
        return false;
    }
}
