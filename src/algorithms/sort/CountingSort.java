package algorithms.sort;

/**
 * Time complexity - O(n+k) n is the number of elements in the array and k is the range of elements.
 * Counting algorithms.sort is efficient if the range of input data is not significantly greater
 */

public class CountingSort {
    public void sort(int[] a, int max) {
        int[] count = new int[max+1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                a[k++] = i;
            }
        }
    }
}
