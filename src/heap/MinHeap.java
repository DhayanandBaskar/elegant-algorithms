package heap;

import static utils.Util.swap;

/**
 * Binary Heap
 * Time complexity - getMin : O(1), pop : O(log n), add :  O(log n)
 */

public class MinHeap {
    int index = 0;
    int[] store;

    MinHeap(int n) {
        store = new int[n];
    }

    public void add(int item) {
        store[++index] = item;
        swim(index);
    }

    private void swim(int k) {
        while (k / 2 != 0 && store[k] < store[k / 2]) {
            swap(store, k, k / 2);
            k = k / 2;
        }
    }

    public int pop() {
        swap(store, 1, index--);
        sink(1);
        return store[index + 1];
    }

    public int getMin() {
        return store[1];
    }

    private void sink(int k) {
        while (k * 2 <= index) {
            int j = k * 2;
            if (j < index && store[j] > store[j + 1]) j++;
            if (store[k] < store[j]) break;
            swap(store, k, j);
            k = j;
        }
    }
}