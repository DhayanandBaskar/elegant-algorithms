package sort;

import static utils.Util.swap;

/**
 * Time complexity - worst case - O(n^2) but if we shuffle the array the chances of having the worst case has some what
 * the same probability of us getting struck by lightning right now.
 * Average time complexity - O(n log n)
 *
 * Space complexity - In-place sorting O(1)
 */

public class QuickSort {
    public void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int start, int end) {
        if (start >= end) return;

        int p = pivot(a, start, end);
        sort(a, start, p - 1);
        sort(a, p + 1, end);
    }

    private int pivot(int[] a, int start, int end) {
        int i = start, j = end + 1, p = start;
        while (true) {
            while (a[++i] < a[p])
                if (i > end) break;
            while (a[--j] > a[p])
                if (j < start) break;
            if (i >= j) break;
            swap(a, i, j);
        }
        swap(a, j, p);
        return j;
    }
}
