package series;

/**
 * Technique: Dynamic Programming
 * Time Complexity = O(n)
 * Space Complexity = O(n)
 */

public class Fibonacci {
    public int[] fibo(int n) {
        int[] a = new int[n];
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a;
    }
}
