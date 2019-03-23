package sort;

/**
 * Time complexity - O(n log n)
 * Space complexity - Not in place - O(n) - auxiliary array
 * Stable Sort
 */

public class MergeSort {
    public void sort(int[] a) {
        sort(a, 0, a.length - 1, new int[a.length]);
    }

    private void sort(int[] a, int start, int end, int[] aux) {
        if (start == end)
            return;
        int mid = start + (end - start) / 2;
        sort(a, start, mid, aux);
        sort(a, mid + 1, end, aux);
        merge(a, start, mid, end, aux);
    }

    private void merge(int[] a, int start, int mid, int end, int[] aux) {
        for (int k = start; k <= end; k++)
            aux[k] = a[k];
        int i = start, j = mid + 1;
        for (int k = start; k <= end; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > end) a[k] = aux[i++];
            else if (aux[i] < aux[j]) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }
}
