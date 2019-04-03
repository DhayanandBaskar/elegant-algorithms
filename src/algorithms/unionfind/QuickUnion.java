package algorithms.unionfind;

/**
 * Weighted QuickUnion with path compression
 * There is a proof that the depth of any node in this tree is at most log base 2 of N - (if n is a billion then log base 2 is 30)
 * Time complexity - union is log base 2 of N, isConnected is  log base 2 of N
 */

public class QuickUnion {

    int[] store;
    int[] size;

    public QuickUnion(int n) {
        store = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            store[i] = i;
            size[i] = 1;
        }
    }

    public void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) return;
        if (size[a] > size[b]) {
            store[b] = a;
            size[a] += size[b];
        } else {
            store[a] = b;
            size[b] += size[a];
        }
    }

    public boolean isConnected(int a, int b) {
        return find(a) == find(b);
    }

    private int find(int a) {
        while (a != store[a]) {
            store[a] = store[store[a]]; //path compression
            a = store[a];
        }
        return a;
    }
}
