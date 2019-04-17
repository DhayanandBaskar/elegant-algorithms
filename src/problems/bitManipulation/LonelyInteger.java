package problems.bitManipulation;

/**
 * Given a list of integers find the only integer that does not repeat.
 * We can do this using HashMap but requires time - O(n) and space O(n).
 * But instead if we use bit manipulation, we can reduce the space complexity to O(1)
 *
 * By taking xor of all the elements, we cancel out repeating elements and what remains is the loner.
 */

public class LonelyInteger {
    public int find(int[] integers) {
        int result = 0;
        for(int value: integers) {
            result ^= value;
        }
        return result;
    }
}
