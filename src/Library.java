/**
 * Created by amit on 18/07/16.
 */
public class Library {
    private final static int MAX_NUM_OF_BOOKS = 10;
    private static Library instance;
    private RBTree<Long, Member> Members;
    private RBTree<String, Book> Books;
    private RBTree<Long, Member>[] MembersByLoans;

    private Library() {
        this.Books = new RBTree<String, Book>();
        this.Members = new RBTree<Long, Member>();
        this.MembersByLoans = new RBTree[MAX_NUM_OF_BOOKS + 1];
        for (int i = 0; i < MAX_NUM_OF_BOOKS + 1; i++) {
            this.MembersByLoans[i] = new RBTree<Long, Member>();

        }
    }

    /**
     * make library a singleton
     *
     * @return the library instance
     */
    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }

        return instance;
    }

    public void runLibrary() {


    }

    public RBTree<Long, Member> getMembers() {
        return Members;
    }

    public RBTree<String, Book> getBooks() {
        return Books;
    }

    public RBTree<Long, Member>[] getMembersByLoans() {
        return MembersByLoans;
    }
}
