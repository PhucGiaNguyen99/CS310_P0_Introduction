

/**
 * A class for creating a box of two items.
 *
 * @param <T> for the type of the first item
 * @param <V> for the type of the second item.
 * @author Phuc Nguyen
 */
public class TwoItemBox<T, V> {
    /**
     * The first item of the box.
     */
    private T item1;
    /**
     * The second item of the box.
     */
    private V item2;

    /**
     * Constructor for class TwoItemsBox.
     *
     * @param item1 first item of the box
     * @param item2 second item of the box
     */
    public TwoItemBox(T item1, V item2) {
        this.item1 = item1;
        this.item2 = item2;
    }


    /**
     * Returns the first item of the box.
     *
     * @return the first item of the box
     */
    public T getItem1() {
        return item1;
    }

    /**
     * Returns the second item of the box.
     *
     * @return the second item of the box
     */
    public V getItem2() {
        return item2;
    }
}
