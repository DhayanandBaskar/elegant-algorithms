package dataStructures.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * For a continuous set of transactions as input always return top m transactions.
 * Time complexity: add - O(log n), find - O(m long n) where m is the number of top transactions to be returned.
 */

public class TopTransactions {

    MinHeap heap;
    int size;

    public TopTransactions(int size) {
        heap = new MinHeap(size);
        this.size = size;
    }

    public List<Integer> find() {
        MinHeap heap = new MinHeap(this.heap);
        List<Integer> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            result.add(heap.pop());
        }
        return result;
    }

    public void add(int amount) {
        if(heap.isEmpty() || heap.size() < size) {
            heap.add(amount);
        } else {
            if(amount > heap.peek()) {
                heap.pop();
                heap.add(amount);
            }
        }
    }
}
