package problems.bitManipulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LonelyIntegerTest {

    @Test
    public void shouldFindLonelyIntegerGivenAListOfIntegers() {
        int[] integers = {5, 7, 1, 8, 3, 6, 7, 3, 5, 1, 6};
        LonelyInteger lonelyInteger = new LonelyInteger();

        int loner = lonelyInteger.find(integers);

        assertEquals(8, loner);
    }
}