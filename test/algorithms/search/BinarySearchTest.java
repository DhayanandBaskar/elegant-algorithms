package algorithms.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void shouldSearchAndReturnTheIndexForAGivenElement() {
        int[] a = {1, 4, 6, 8, 11, 23, 29, 31, 39, 42, 44, 65, 73, 81};
        int index = (new BinarySearch()).search(a, 65);
        assertEquals(11, index);
    }

    @Test
    public void shouldReturnNegativeOneIfElementNotFound() {
        int[] a = {1, 4, 6, 8, 11, 23, 29, 31, 39, 42, 44, 65, 73, 81};
        int index = (new BinarySearch()).search(a, 101);
        assertEquals(-1, index);
    }

    @Test
    public void shouldReturnNegativeOneIfSearchInvokedOnANullArray() {
        int index = (new BinarySearch()).search(null, 101);
        assertEquals(-1, index);
    }

    @Test
    public void shouldReturnNegativeOneIfSearchInvokedOnAnEmptyArray() {
        int[] a = {};
        int index = (new BinarySearch()).search(a, 101);
        assertEquals(-1, index);
    }
}