package dataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void shouldBeAbleToEnqueAndDequeElements() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);

        assertEquals(5, queue.dequeue());
        assertEquals(6, queue.dequeue());
        assertEquals(7, queue.dequeue());
        assertEquals(8, queue.dequeue());
        assertEquals(9, queue.dequeue());
    }
}