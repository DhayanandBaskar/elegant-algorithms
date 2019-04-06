package dataStructures.binarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void shouldBeAbleToPutAndGetValuesIntoBST() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.put(5, 25);
        bst.put(6, 22);
        bst.put(11, 15);
        bst.put(1, 100);
        bst.put(3, 44);

        assertEquals(44, bst.get(3).getVal());
        assertEquals(100, bst.get(1).getVal());
        assertEquals(15, bst.get(11).getVal());
        assertEquals(22, bst.get(6).getVal());
        assertEquals(25, bst.get(5).getVal());
    }
}