package dataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResizingArrayTest {

    @Test
    public void shouldResizeWhenCapacityExceeds() {
        ResizingArray array = new ResizingArray(3);
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.add(70);
        array.add(80);

        assertEquals(8, array.getSize());
    }

    @Test
    public void shouldResizeWhenCapacityReduces() {
        ResizingArray array = new ResizingArray(3);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);

        array.remove(3);
        array.remove(3);
        array.remove(3);
        array.remove(3);
        array.remove(3);
        array.remove(3);
        assertEquals(6, array.getStoreSize());
    }

    @Test
    public void shouldReturnElementForAGivenIndex() {
        ResizingArray array = new ResizingArray(5);
        array.add(10);
        array.add(50);
        array.add(500);
        assertEquals(50, array.get(1));
    }

    @Test
    public void shouldRemoveAndReturnElementFromAGivenIndex() {
        ResizingArray array = new ResizingArray(5);
        array.add(110);
        array.add(20);
        array.add(3);
        assertEquals(20, array.remove(1));
    }

}