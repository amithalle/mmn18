/**
 * Created by amit on 18/07/16.
 */
public class NewPersonCmd extends Command {
    private String name;
    private long ID;

    public NewPersonCmd(String name, long id) {
        this.name = name;
        ID = id;
    }


    @Override
    public boolean act() {
        return false;
    }
}
