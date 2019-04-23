package problems.string;

/**
 * Anagram: same letter, same count, different order
 * Given two strings(lower case a -> z) how many chars do we need to remove to make them anagrams
 * Example: glue, legs --> Answer: 2 (u from glue and s from legs)
 */

public class Anagram {

    public static final int NUMBER_OF_CHARACTERS = 26;

    public int numberOfChanges(String firstString, String secondString) {
        int[] charCountFirst = getCharCount(firstString);
        int[] charCountSecond = getCharCount(secondString);
        return getDelta(charCountFirst, charCountSecond);
    }

    private int[] getCharCount(String str) {
        int[] charCount = new int[NUMBER_OF_CHARACTERS];
        int offset = (int) 'a';
        for (char c : str.toCharArray()) {
            charCount[c - offset]++;
        }
        return charCount;
    }

    private int getDelta(int[] charCount1, int[] charCount2) {
        int diff = 0;
        for (int i = 0; i < NUMBER_OF_CHARACTERS; i++) {
            diff += Math.abs(charCount1[i] - charCount2[i]);
        }
        return diff;
    }
}
