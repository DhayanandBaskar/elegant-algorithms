package linkedList;

/**
 * Time complexity
 * linkFirst, linkLast - O(1)
 * linkBetween - O(1)
 * find = O(n)
 */

public class LinkedList {

    private Node first;
    private Node last;

    public class Node {
        private int data;
        protected Node next;
        protected Node prev;

        Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }
    }

    public void linkFirst(int data) {
        Node old = first;
        first = new Node(data);
        if (last == null) {
            last = first;
        } else {
            first.next = old;
            old.prev = first;
        }
    }

    public void linkLast(int data) {
        Node secLast = last;
        last = new Node(data);
        secLast.next = last;
        last.prev = secLast;
    }

    public void linkBetween(int data, Node node) {
        Node temp = new Node(data);
        temp.prev = node;
        temp.next = node.next;
        node.next = temp;
    }

    public Node find(int data) {
        Node current = first;
        while (current != null) {
            if (data == current.getData()) return current;
            current = current.next;
        }
        return null;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }
}
