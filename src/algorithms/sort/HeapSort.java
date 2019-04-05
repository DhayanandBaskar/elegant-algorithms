package algorithms.sort;

import dataStructures.heap.MinHeap;

/**
 * In-place sorting with O(n log n) time complexity,
 * in-place if we use the min heap to store the data directly
 * Heap Sort is not stable
 */

public class HeapSort {

    public void sort(int[] a) {
        MinHeap heap = new MinHeap(a.length);
        for (int element : a) {
            heap.add(element);
        }
        for (int i = 0; i < a.length; i++)
            a[i] = heap.pop();
    }
}
