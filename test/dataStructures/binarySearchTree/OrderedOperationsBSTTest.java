package dataStructures.binarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderedOperationsBSTTest {
    @Test
    public void shouldFindFloorInBST() {
        OrderedOperationsBST bst = constructBST();
        assertEquals(3, bst.floor(4).key);
    }

    @Test
    public void shouldFindCeilInBST() {
        OrderedOperationsBST bst = constructBST();
        assertEquals(5, bst.ceil(4).key);
    }

    @Test
    public void shouldFindAndReturnMinInBST() {
        OrderedOperationsBST bst = constructBST();
        assertEquals(15, bst.min().getVal());
    }

    @Test
    public void shouldFindAndReturnMaxInBST() {
        OrderedOperationsBST bst = constructBST();
        assertEquals(100, bst.max().getVal());
    }

    private OrderedOperationsBST constructBST() {
        OrderedOperationsBST bst = new OrderedOperationsBST();

        bst.put(5, 25);
        bst.put(6, 22);
        bst.put(1, 15);
        bst.put(100, 100);
        bst.put(3, 44);

        return bst;
    }
}