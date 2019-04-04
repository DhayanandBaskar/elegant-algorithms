package algorithms.series;

/**
 * Time Complexity = O(n)
 * Space Complexity = O(n)
 */

public class Fibonacci {
    public int[] fibo(int n) {
        int[] output = new int[n];
        int a = 0, b = 1;
        output[0] = a;
        output[1] = b;

        for (int i = 2; i < n; i++) {
            int c = a + b;
            output[i] = c;
            a = b;
            b = c;
        }
        return output;
    }
}
