package dataStructures.binarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeletableBSTTest {

    @Test
    public void shouldDeleteMin() {
        DeletableBST bst = constructBST();

        assertEquals(100, bst.get(1).getVal());
        bst.deleteMin();
        assertTrue(bst.get(1) == null);
    }

    @Test
    public void shouldDeleteMax() {
        DeletableBST bst = constructBST();

        assertEquals(15, bst.get(11).getVal());
        bst.deleteMax();
        assertTrue(bst.get(11) == null);
    }

    @Test
    public void shouldDeleteGivenKey() {
        DeletableBST bst = constructBST();

        assertEquals(22, bst.get(6).getVal());
        bst.delete(6);
        assertTrue(bst.get(6) == null);
    }

    private DeletableBST constructBST() {
        DeletableBST bst = new DeletableBST();
        bst.put(5, 25);
        bst.put(6, 22);
        bst.put(11, 15);
        bst.put(1, 100);
        bst.put(3, 44);
        return bst;
    }
}