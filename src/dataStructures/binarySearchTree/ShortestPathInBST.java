package dataStructures.binarySearchTree;

public class ShortestPathInBST {
    public String shortestPath(BinarySearchTree bst, int source, int destination) {
        if (!bst.contains(source) || !bst.contains(destination)) return "";

        if (source > destination) {
            int temp = source;
            source = destination;
            destination = temp;
        }

        StringBuilder br = new StringBuilder();

        shortestPath(bst.root, source, destination, br);

        return br.toString();
    }

    private void shortestPath(BinarySearchTree.Node node, int source, int destination, StringBuilder br) {
        if (source < node.key && destination < node.key)
            shortestPath(node.left, source, destination, br);
        else if (source > node.key && destination > node.key)
            shortestPath(node.right, source, destination, br);
        else {
            probe(node.left, source, br);
            br.append(node.key + " ");
            probe(node.right, destination, br);
        }
    }

    private void probe(BinarySearchTree.Node node, int key, StringBuilder br) {
        if (node == null) return;

        br.append(node.key + " ");
        if (key < node.key) probe(node.left, key, br);
        else if (key > node.key) probe(node.right, key, br);
        else return;
    }
}
