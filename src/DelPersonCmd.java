/**
 * Created by amit on 18/07/16.
 */
public class DelPersonCmd extends Command {
    private long ID;

    public DelPersonCmd(long id) {
        ID = id;
    }


    @Override
    public boolean act() {
        return false;
    }
}
