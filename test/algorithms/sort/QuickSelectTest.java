package algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSelectTest {

    @Test
    public void shouldSelectKthElementFromTheGivenArray() {
        int[] a = {44, 81, 23, 11, 39, 4, 1, 6, 73, 42, 29, 65, 8, 31};
        int kthLargest  = (new QuickSelect()).select(a, 10);
        assertEquals(44, kthLargest);
    }
}