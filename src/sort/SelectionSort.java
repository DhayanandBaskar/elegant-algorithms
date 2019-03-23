package sort;

import static utils.Util.swap;

/**
 * Time Complexity  - O(n^2)
 * Space Complexity  - In-place sorting O(1)
 */

public class SelectionSort {

    public void sort(int[] a) {
        if(a == null) return;

        for(int i = 0 ; i < a.length; i++) {
            int minIndex = i;
            for(int j = i; j < a.length; j++) {
                if(a[j] < a[minIndex]) minIndex = j;
            }
            swap(a, i, minIndex);
        }
    }
}
