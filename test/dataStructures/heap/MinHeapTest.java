package dataStructures.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinHeapTest {

    @Test
    public void shouldPopMinElementOnAGivenSequenceOfElements() {
        MinHeap heap = new MinHeap(20);
        heap.add(55);
        heap.add(5);
        heap.add(11);
        heap.add(14);
        heap.add(33);
        heap.add(2);
        heap.add(7);
        heap.add(109);
        heap.add(5);

        int min = heap.getMin();
        assertEquals(2, min);
    }

    @Test
    public void shouldPopTheElementsInAssentingOrder() {
        MinHeap heap = new MinHeap(20);
        heap.add(66);
        heap.add(5);
        heap.add(11);
        heap.add(14);
        heap.add(33);
        heap.add(2);
        heap.add(7);
        heap.add(6);
        heap.add(5);
        heap.add(105);
        heap.add(555);

        int[] a = new int[11];
        for (int i = 0; i < a.length; i++) {
            a[i] = heap.pop();
        }
        int[] expected = {2, 5, 5, 6, 7, 11, 14, 33, 66, 105, 555};
        assertArrayEquals(expected, a);
    }

    @Test
    public void shouldReturnMinElementWithoutRemovingFromHeapOnPeek() {
        MinHeap heap = new MinHeap(20);
        heap.add(66);
        heap.add(5);
        heap.add(11);
        heap.add(14);

        assertEquals(5, heap.peek());
        assertEquals(5, heap.peek());
    }

    @Test
    public void shouldReturnSizeOfHeap() {
        MinHeap heap = new MinHeap(20);
        heap.add(66);
        heap.add(5);
        heap.add(11);
        heap.add(105);
        heap.add(555);

        assertEquals(5, heap.size());
    }

    @Test
    public void shouldReturnTrueIfHeapIsEmpty() {
        MinHeap heap = new MinHeap(20);
        heap.add(66);
        heap.pop();
        assertTrue(heap.isEmpty());
    }

    @Test
    public void shouldCreateCopyOfAHeapUsingConstructor() {
        MinHeap heap = new MinHeap(20);
        heap.add(66);
        heap.add(5);
        heap.add(11);
        heap.add(14);
        heap.add(105);
        heap.add(555);

        MinHeap newHeap = new MinHeap(heap);
        assertEquals(5, newHeap.pop());
        assertEquals(11, newHeap.pop());
        assertEquals(14, newHeap.pop());
        assertEquals(66, newHeap.pop());
        assertEquals(105, newHeap.pop());
        assertEquals(555, newHeap.pop());
    }
}