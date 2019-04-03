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

}