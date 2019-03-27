package unionfind;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickUnionTest {

    @Test
    public void shouldReturnTrueIfTwoElementsAreConnected() {
        QuickUnion quickUnion = new QuickUnion(20);
        quickUnion.union(5 ,4);
        quickUnion.union(8 ,7);
        quickUnion.union(11 ,9);
        quickUnion.union(4 ,9);
        quickUnion.union(6 ,9);

        assertTrue(quickUnion.isConnected(6, 5));
    }

    @Test
    public void shouldReturnFalseIfTwoElementsAreNotConnected() {
        QuickUnion quickUnion = new QuickUnion(20);
        quickUnion.union(5 ,4);
        quickUnion.union(8 ,7);
        quickUnion.union(11 ,9);
        quickUnion.union(4 ,9);
        quickUnion.union(6 ,9);

        assertFalse(quickUnion.isConnected(8, 5));
    }
}