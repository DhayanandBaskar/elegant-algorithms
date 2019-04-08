package dataStructures.binarySearchTree;

public class OrderedOperationsBST extends BinarySearchTree {

    public Node floor(int key) {
        return floor(root, key);
    }

    private Node floor(Node x, int key) {
        if (x == null) return null;

        if (key < x.key) return floor(x.left, key);
        else if (key == x.key) return x;
        else {
            Node temp = floor(x.right, key);
            if (temp != null) return temp;
            else return x;
        }
    }

    public Node ceil(int key) {
        return ceil(root, key);
    }

    private Node ceil(Node x, int key) {
        if (x == null) return null;

        if (key > x.key) return ceil(x.right, key);
        else if (key == x.key) return x;
        else {
            Node temp = ceil(x.left, key);
            if (temp != null) return temp;
            else return x;
        }
    }

    public Node min() {
        if (root == null) return null;

        Node x = root;
        while (x.left != null) {
            x = x.left;
        }

        return x;
    }

    public Node max() {
        if (root == null) return null;

        Node x = root;
        while (x.right != null) {
            x = x.right;
        }

        return x;
    }
}
