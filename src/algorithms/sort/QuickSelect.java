package algorithms.sort;

/**
 * Based on quick algorithms.sort
 * Given an unsorted array find the kth largest element with out sorting
 *
 * Average Time complexity - O(n), worst case - O(n^2) but random shuffle provides
 * a probabilistic guarantee (chance of getting struck by a lightning).
 */

public class QuickSelect {
    public int select(int[] a, int k) {
        if (k >= a.length) return -1;

        QuickSort quick = new QuickSort();
        int start = 0, end = a.length - 1;
        while (true) {
            int p = quick.pivot(a, start, end);
            if (k < p) end = p - 1;
            else if (k > p) start = p + 1;
            else return a[k];
        }
    }
}
