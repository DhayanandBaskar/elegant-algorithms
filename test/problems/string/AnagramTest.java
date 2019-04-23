package problems.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void GivenTwoStrings_ShouldReturnTheNumberOfChangesToConvertToAnagram() {
        Anagram anagram = new Anagram();
        assertEquals(6, anagram.numberOfChanges("hello", "billion"));
    }
}