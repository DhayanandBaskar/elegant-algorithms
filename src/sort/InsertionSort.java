package sort;

import static utils.Util.swap;

/**
 * Time Complexity  - O(n^2)
 * Space Complexity  - In-place sorting O(1)
 * Stable Sort
 *
 * Advantage over QuickSelect sort - Insertion sort does less operations on a already sorted or mostly in order list of elements
 */

public class InsertionSort {

    public void sort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if(a[j] < a[j-1]) swap(a, j, j-1);
            }
        }
    }
}
