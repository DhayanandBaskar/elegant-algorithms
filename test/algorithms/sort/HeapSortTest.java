package algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeapSortTest {

    @Test
    public void shouldSortTheGivenArray() {
        HeapSort sort = new HeapSort();
        int[] a = {44, 81, 23, 11, 39, 4, 1, 6, 73, 42, 29, 65, 8, 31};
        int[] expected = {1, 4, 6, 8, 11, 23, 29, 31, 39, 42, 44, 65, 73, 81};
        sort.sort(a);
        assertArrayEquals(expected, a);
    }
}