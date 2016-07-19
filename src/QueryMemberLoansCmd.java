/**
 * Created by amit on 18/07/16.
 */
public class QueryMemberLoansCmd extends Command {
    private long memberId;

    public QueryMemberLoansCmd(long memberId) {
        this.memberId = memberId;
    }

    @Override
    public boolean act() {
        Member m = Library.getInstance().getMembers().search(this.memberId);
        System.out.println("Member " + m.toString() + " loaned the following books:");
        for (Book b : m.getBooks()) {
            System.out.println(b.toString());
        }

        return true;
    }
}
