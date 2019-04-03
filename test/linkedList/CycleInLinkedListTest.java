package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class CycleInLinkedListTest {

    @Test
    public void shouldReturnTrueIfCycleIsPresent() {
        CycleInLinkedList list = constructLinkedList();

        LinkedList.Node a = list.find(5);
        LinkedList.Node b = list.find(9);

        list.link(a, b);

        assertTrue(list.findCycle());
    }

    @Test
    public void shouldReturnFalseIfCycleIsNotPresent() {
        CycleInLinkedList list = constructLinkedList();
        assertFalse(list.findCycle());
    }

    private CycleInLinkedList constructLinkedList() {
        CycleInLinkedList list = new CycleInLinkedList();

        list.linkFirst(5);
        list.linkFirst(6);
        list.linkFirst(7);
        list.linkFirst(8);
        list.linkFirst(9);
        list.linkFirst(10);
        list.linkFirst(11);

        return list;
    }
}