/**
 * Created by amit on 18/07/16.
 */
public class QueryMostBookLoansCmd extends Command {
    @Override
    public boolean act() {
        boolean found = false;
        for (int i = Library.MAX_NUM_OF_BOOKS; i >= 0 && !found; i++) {
            if (Library.getInstance().getMembersByLoans()[i].getSize() > 0) {
                found = true;
                System.out.println("The people with most books loaned " + i +
                        " books.\nthe members are:");
                for (Member m : Library.getInstance().getMembersByLoans()[i].values()) {
                    System.out.println(m.toString());
                }
            }
        }

        return true;
    }
}
