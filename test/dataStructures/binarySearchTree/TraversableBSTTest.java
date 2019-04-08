package dataStructures.binarySearchTree;

import dataStructures.basic.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraversableBSTTest {

    @Test
    public void shouldReturnBSTKeysViaQueueInOrder() {
        TraversableBST bst = constructBST();
        Queue queue = bst.inOrderKeys();
        assertEquals(1, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(5, queue.dequeue());
        assertEquals(6, queue.dequeue());
        assertEquals(11, queue.dequeue());
    }

    @Test
    public void shouldReturnBSTKeysViaQueuePreOrder() {
        TraversableBST bst = constructBST();
        Queue queue = bst.preOrderKeys();
        assertEquals(5, queue.dequeue());
        assertEquals(1, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(6, queue.dequeue());
        assertEquals(11, queue.dequeue());
    }

    @Test
    public void shouldReturnBSTKeysViaQueuePostOrder() {
        TraversableBST bst = constructBST();
        Queue queue = bst.postOrderKeys();
        assertEquals(3, queue.dequeue());
        assertEquals(1, queue.dequeue());
        assertEquals(11, queue.dequeue());
        assertEquals(6, queue.dequeue());
        assertEquals(5, queue.dequeue());
    }


    private TraversableBST constructBST() {
        TraversableBST bst = new TraversableBST();
        bst.put(5, 26);
        bst.put(6, 22);
        bst.put(11, 15);
        bst.put(1, 100);
        bst.put(3, 44);
        return bst;
    }

}