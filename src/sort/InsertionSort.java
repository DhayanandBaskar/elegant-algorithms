package sort;

/**
 * Time Complexity  - O(n^2)
 * Space Complexity  - In-place sorting O(1)
 *
 * Advantage over Selection sort - Insertion sort does less operations on a already sorted or mostly in order list of elements
 */

public class InsertionSort {

    public void sort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if(a[j] < a[j-1]) swap(a, j, j-1);
            }
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
