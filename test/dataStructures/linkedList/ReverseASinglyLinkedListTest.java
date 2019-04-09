package dataStructures.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseASinglyLinkedListTest {

    @Test
    public void shouldReverseASinglyLinkedList() {
        ReverseASinglyLinkedList reverser = new ReverseASinglyLinkedList();
        LinkedList.Node node = reverser.reverse(constructLinkedList().getFirst());
        StringBuilder br = new StringBuilder();
        while (node != null) {
            br.append(node.getData() + " ");
            node = node.getNext();
        }

        System.out.println(br.toString().trim());
        assertEquals("11 10 9 8", br.toString().trim());
    }

    private LinkedList constructLinkedList() {
        LinkedList list = new LinkedList();
        list.linkLast(8);
        list.linkLast(9);
        list.linkLast(10);
        list.linkLast(11);
        return list;
    }
}