package dataStructures.binarySearchTree;

public class MinMaxInBST extends BinarySearchTree {

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
