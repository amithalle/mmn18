/**
 * Created by amit on 18/07/16.
 */
public class Person implements Comparable<Person> {
    private long ID;
    private String name;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        return 0;
    }
}
