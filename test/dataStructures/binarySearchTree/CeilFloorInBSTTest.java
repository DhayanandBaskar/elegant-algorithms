package dataStructures.binarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class CeilFloorInBSTTest {

    @Test
    public void shouldFindFloorInBST() {
        CeilFloorInBST bst = constructBST();
        assertEquals(3, bst.floor(4).key);
    }

    @Test
    public void shouldFindCeilInBST() {
        CeilFloorInBST bst = constructBST();
        assertEquals(5, bst.ceil(4).key);
    }

    private CeilFloorInBST constructBST() {
        CeilFloorInBST bst = new CeilFloorInBST();

        bst.put(5, 25);
        bst.put(6, 22);
        bst.put(1, 15);
        bst.put(100, 100);
        bst.put(3, 44);

        return bst;
    }
}