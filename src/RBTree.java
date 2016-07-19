import java.util.Collection;

public class RBTree<Key extends Comparable<Key>, Val> {
    private Key key;
    private RBColor color;
    private int size;
    private RBTree<Key, Val> right;
    private RBTree<Key, Val> left;
    private Val value;


    public RBTree() {
        this.setSize(0);
        this.setColor(RBColor.Black);
    }
    public RBTree(Key key, Val value, RBColor color, int size, RBTree<Key, Val> right, RBTree<Key, Val> left) {
        this.key = key;
        this.value = value;
        this.color = color;
        this.size = size;
        this.right = right;
        this.left = left;

    }

    public Key getKey() {
        return key;
    }

    public RBColor getColor() {
        return color;
    }

    private void setColor(RBColor color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public RBTree<Key, Val> getRight() {
        return right;
    }

    private void setRight(RBTree<Key, Val> right) {
        this.right = right;
    }

    public RBTree<Key, Val> getLeft() {
        return left;
    }

    private void setLeft(RBTree<Key, Val> left) {
        this.left = left;
    }

    public boolean hasRight() {
        return this.getRight() != null;
    }

    public boolean hasLeft() {
        return this.getLeft() != null;
    }

    public Val search(Key value) {
        return null;
    }

    public void insert(Key k, Val v) {

    }

    public void delete(Key k) {

    }

    public RBTree<Key, Val> successor() {
        return null;
    }

    public RBTree<Key, Val> predecessor() {
        return null;
    }

    public Val getValue() {
        return value;
    }

    public void setValue(Val value) {
        this.value = value;
    }

    public Collection<Val> values() {
        return null;
    }
}
