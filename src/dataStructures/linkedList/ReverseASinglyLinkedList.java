package dataStructures.linkedList;

/**
 * Time complexity - O(n)
 */

public class ReverseASinglyLinkedList {
    public LinkedList.Node reverse(LinkedList.Node node) {
        if (node == null) return null;

        LinkedList.Node prev = null;
        LinkedList.Node current = node;
        LinkedList.Node next = current.next;

        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (current != null) {
                next = current.next;
            }
        }
        return prev;
    }
}
