/**
 * Created by amit on 18/07/16.
 */
public class NewMemberCmd extends Command {
    private String name;
    private long ID;

    public NewMemberCmd(String name, long id) {
        this.name = name;
        ID = id;
    }


    @Override
    /**
     * adds a member to the member list
     */
    public boolean act() {
        Member m = new Member(this.ID, this.name);
        Library.getInstance().getMembers().insert(this.ID, m);
        Library.getInstance().getMembersByLoans()[0].insert(this.ID, m);

        return true;
    }
}
