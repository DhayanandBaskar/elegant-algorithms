package dataStructures.binarySearchTree;

public class DeletableBST extends BinarySearchTree {

    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    public void deleteMax() {
        root = deleteMax(root);
    }

    private Node deleteMax(Node x) {
        if (x.right == null) return x.left;
        x.right = deleteMax(x.right);
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    private Node delete(Node x, int key) {
        if (x == null) return null;
        if (key < x.key) return delete(x.left, key);
        else if (key > x.key) return delete(x.right, key);
        else {
            if (x.right == null) return x.left;
            if (x.left == null) return x.right;

            Node temp = x;
            x = min(temp.right);
            deleteMin(temp.right);
            x.left = temp.left;
            x.right = temp.right;
        }
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    private Node min(Node x) {
        if (x == null) return null;
        while (x.left != null) {
            x = x.left;
        }
        return x;
    }
}
