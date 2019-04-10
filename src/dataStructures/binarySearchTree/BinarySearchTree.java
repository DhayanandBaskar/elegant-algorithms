package dataStructures.binarySearchTree;

/**
 * Time complexity - worst case - search/insert/rank - O(h) where h is the height of the tree
 * it take at least O(log n) compares to find a node
 */

public class BinarySearchTree {

    protected Node root;

    public class Node {
        protected int key;
        protected int val;
        protected Node left;
        protected Node right;
        protected int count;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.count = 1;
        }

        public int getVal() {
            return val;
        }
    }

    public void put(int key, int val) {
        root = put(root, key, val);
    }

    public Node get(int key) {
        return get(root, key);
    }

    public int size() {
        return size(root);
    }

    public int rank(int key) {
        return rank(root, key);
    }

    public boolean contains(int key) {
        return get(key) != null;
    }

    private int rank(Node x, int key) {
        if (x == null) return 0;

        if (key < x.key) return rank(x.left, key);
        else if (key > x.key) return 1 + size(x.left) + rank(x.right, key);
        else return size(x.left);
    }

    protected int size(Node x) {
        if (x == null) return 0;
        return x.count;
    }

    private Node put(Node x, int key, int val) {
        if (x == null) return new Node(key, val);

        if (key < x.key)
            x.left = put(x.left, key, val);
        else if (key > x.key)
            x.right = put(x.right, key, val);
        else
            x.val = val;
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    private Node get(Node x, int key) {
        if (x == null) return null;

        if (key < x.key)
            return get(x.left, key);
        else if (key > x.key)
            return get(x.right, key);
        else
            return x;
    }
}
