package dataStructures.linkedList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoublyLinkedListTest {

    @Test
    public void shouldBeAbleToAddElementsAndIterateThroughList() {
        DoublyLinkedList doublyLinkedList = constructLinkedList();

        DoublyLinkedList.Node n = doublyLinkedList.getFirst();
        StringBuilder br = new StringBuilder();
        int count = 1;
        while (n != null) {
            if (n.getData() % 2 == 1 && count++ < 10) {
                doublyLinkedList.linkBetween(n.getData() + 1, n);
            }
            br.append(n.getData() + " ");
            n = n.getNext();
        }
        System.out.println(br.toString().trim());
        assertEquals("5 6 7 8 9 10 11 12", br.toString().trim());
    }

    @Test
    public void shouldBeAbleToTraverseTheLinkedListInReverseOrder() {
        DoublyLinkedList list = constructLinkedList();

        DoublyLinkedList.Node node = list.getLast();
        StringBuilder br = new StringBuilder();
        while (node != null) {
            br.append(node.getData() + " ");
            node = node.getPrev();
        }

        System.out.println(br.toString().trim());
        assertEquals("11 9 7 5", br.toString().trim());
    }

    private DoublyLinkedList constructLinkedList() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.linkFirst(7);
        list.linkFirst(5);
        list.linkLast(9);
        list.linkLast(11);
        return list;
    }
}