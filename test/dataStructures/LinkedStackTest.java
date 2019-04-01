package dataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedStackTest {

    @Test
    public void shouldBeAbleToPushAndPopElementsToStack() {
        LinkedStack stack = new LinkedStack();
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
        assertTrue(stack.isEmpty());
    }
}