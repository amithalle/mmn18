/**
 * Created by amit on 18/07/16.
 */
public class DelMemberCmd extends Command {
    private long ID;

    public DelMemberCmd(long id) {
        ID = id;
    }


    @Override
    public boolean act() {
        Member m = Library.getInstance().getMembers().search(this.ID);
        Library.getInstance().getMembers().delete(this.ID);
        Library.getInstance().getMembersByLoans()[m.getBooks().size()].delete(this.ID);


        return true;
    }
}
