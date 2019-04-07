package dataStructures.binarySearchTree;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MinMaxInBSTTest {

    @Test
    public void shouldFindAndReturnMinInBST() {
        MinMaxInBST bst = constructBST();
        assertEquals(15 ,bst.min().getVal());
    }

    @Test
    public void shouldFindAndReturnMaxInBST() {
        MinMaxInBST bst = constructBST();
        assertEquals(100 ,bst.max().getVal());
    }

    private MinMaxInBST constructBST() {
        MinMaxInBST bst = new MinMaxInBST();

        bst.put(5, 25);
        bst.put(6, 22);
        bst.put(1, 15);
        bst.put(100, 100);
        bst.put(3, 44);

        return bst;
    }
}