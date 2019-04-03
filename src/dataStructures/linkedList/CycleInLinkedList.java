package dataStructures.linkedList;

/**
 * Time complexity - O(n)
 */

public class CycleInLinkedList extends LinkedList {
    public boolean findCycle() {
        LinkedList.Node slow = this.getFirst();
        LinkedList.Node fast = this.getFirst().getNext();

        while(fast != null && fast.getNext() != null && slow != null) {
            if(slow.getData() == fast.getData()) return true;
            else {
                slow = slow.getNext();
                fast = fast.getNext().getNext();
            }
        }

        return false;
    }

    public void link(Node a, Node b) {
        a.next = b;
    }
}
