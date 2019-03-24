package search;

/**
 * In order for BinarySearch to work the array must be sorted
 * Time complexity - O(log n)
 * Space complexity - O(1)
 */

public class BinarySearch {
    public int search(int[] a, int k) {
        if (a == null || a.length == 0) return -1;

        int start = 0, end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (k < a[mid]) end = mid - 1;
            else if (k > a[mid]) start = mid + 1;
            else return mid;
        }

        return -1;
    }
}
