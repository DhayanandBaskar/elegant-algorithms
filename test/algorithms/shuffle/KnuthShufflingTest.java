package algorithms.shuffle;

import org.junit.Test;

import java.util.Arrays;

/**
 * Can not assert as the shuffle produces new outputs each time we execute this test
 */

public class KnuthShufflingTest {
    @Test
    public void shouldShuffleAGivenArray() {
        int[] a = {44, 81, 23, 11, 39, 4, 1, 6, 73, 42, 29, 65, 8, 31};
        System.out.println("Before: " + Arrays.toString(a));
        KnuthShuffling s = new KnuthShuffling();
        s.shuffle(a);
        System.out.println("After: " + Arrays.toString(a));
    }
}