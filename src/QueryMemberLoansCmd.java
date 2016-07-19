/**
 * Created by amit on 18/07/16.
 */
public class QueryMemberLoansCmd extends Command {
    private Member member;

    public QueryMemberLoansCmd(Member member) {
        this.member = member;
    }

    @Override
    public boolean act() {
        return false;
    }
}
