package algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountingSortTest {

    @Test
    public void shouldSortTheGivenArray() {
        CountingSort countingSort = new CountingSort();
        int[] a = {9, 6, 11, 1, 3, 5, 4, 6, 8, 1, 4, 3, 1, 4, 5, 6, 9, 8, 11, 9, 3, 4, 5};
        int[] expected = {1, 1, 1, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 8, 8, 9, 9, 9, 11, 11};
        countingSort.sort(a, 11);
        assertArrayEquals(expected, a);
    }
}