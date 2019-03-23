package sort;

import static utils.Util.swap;

/**
 * Time complexity - O(n^2)
 * Space Complexity  - In-place sorting O(1)
 */

public class BubbleSort {

    public void sort(int[] a) {
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a.length-1; j++)
                if(a[j] > a[j+1]) swap(a, j, j+1);
    }
}
