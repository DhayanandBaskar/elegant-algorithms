package dataStructures.binarySearchTree;

/**
 * Time complexity - worst case - search/insert- O(h) where h is the height of the tree
 * it take at least O(log n) compares to find a node
 */

public class BinarySearchTree {

    Node root;

    public class Node {
        private int key;
        private int val;
        private Node left;
        private Node right;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    public void put(int key, int val) {
        root = put(root, key, val);
    }

    private Node put(Node x, int key, int val) {
        if (x == null) return new Node(key, val);

        if (key < x.key)
            x.left = put(x.left, key, val);
        else if (key > x.key)
            x.right = put(x.right, key, val);
        else
            x.val = val;
        return x;
    }

    public Node get(int key) {
        return get(root, key);
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
