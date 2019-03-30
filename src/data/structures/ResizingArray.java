package data.structures;

/**
 * Time complexity - add: O(1), get: O(1), remove: O(n)
 * Prevents
 */

public class ResizingArray {

    public static final int INITIAL_SIZE = 5;
    int[] store;
    int index = 0;

    ResizingArray() {
        store = new int[INITIAL_SIZE];
    }

    ResizingArray(int initialSize) {
        store = new int[initialSize];
    }

    public void add(int element) {
        if (index == store.length) resize();

        store[index++] = element;
    }

    public int get(int index) {
        if (index < store.length) {
            return store[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int remove(int index) {
        if (index > this.index) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int result = store[index];
        for (int i = index + 1; i < store.length; i++) {
            store[i - 1] = store[i];
        }
        this.index--;
        reduce();
        return result;
    }

    public int getSize() {
        return index;
    }

    private void reduce() {
        if (index < store.length / 3) {
            store = copy(store.length / 2);
        }
    }


    int getStoreSize() {
        return store.length;
    }

    private void resize() {
        store = copy(store.length * 2);
    }

    private int[] copy(int resize) {
        int[] temp = new int[resize];
        for (int i = 0; i < index; i++) {
            temp[i] = store[i];
        }
        return temp;
    }
}
