package dataStructures.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void shouldBeAbleToAddElementsAndIterateThroughList() {
        LinkedList list = constructLinkedList();

        LinkedList.Node node = list.getFirst();
        StringBuilder br = new StringBuilder();
        int count = 1;
        while (node != null) {
            if (node.getData() % 2 == 1 && count++ < 10)
                list.linkBetween(node.getData() + 1, node);
            br.append(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println(br.toString().trim());
        assertEquals("5 6 7 8 9 10 11 12", br.toString().trim());
    }

    private LinkedList constructLinkedList() {
        LinkedList list = new LinkedList();
        list.linkFirst(7);
        list.linkFirst(5);
        list.linkLast(9);
        list.linkLast(11);
        return list;
    }
}