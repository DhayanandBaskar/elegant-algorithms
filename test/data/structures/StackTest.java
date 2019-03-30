package data.structures;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void shouldBeAbleToPushAndPopElementsToStack() {
        Stack stack = new Stack(10);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        stack.push(66);
        stack.push(77);
        stack.push(88);

        assertEquals(88, stack.pop());
        assertEquals(77, stack.pop());
        assertEquals(66, stack.pop());
        assertEquals(55, stack.pop());
        assertEquals(44, stack.pop());
        assertEquals(33, stack.pop());
        assertTrue(stack.isEmpty());
    }
}