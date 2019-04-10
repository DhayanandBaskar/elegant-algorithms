package dataStructures.binarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestPathInBSTTest {

    @Test
    public void shouldFindShortestPathInBST() {
        BinarySearchTree bst = constructBST();
        ShortestPathInBST pathFinder = new ShortestPathInBST();
        assertEquals("26 24 31 56 71", pathFinder.shortestPath(bst, 24, 71).trim());
    }

    private BinarySearchTree constructBST() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.put(15, 15);
        bst.put(7, 7);
        bst.put(11, 11);
        bst.put(20, 20);
        bst.put(31, 31);
        bst.put(56, 56);
        bst.put(42, 42);
        bst.put(71, 71);
        bst.put(26, 26);
        bst.put(6, 6);
        bst.put(3, 3);
        bst.put(4, 4);
        bst.put(24, 24);

        return bst;
    }
}