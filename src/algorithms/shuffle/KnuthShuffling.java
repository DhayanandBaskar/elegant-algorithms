package algorithms.shuffle;

import java.util.Random;

import static utils.Util.swap;

/**
 * Uniformly random permutation in linear time
 * Time complexity - O(n)
 */

public class KnuthShuffling {
    public void shuffle(int[] a) {
        for (int i = 0; i < a.length; i++) {
            Random random = new Random();
            int r = random.nextInt(i+1);
            swap(a, r, i);
        }
    }
}
