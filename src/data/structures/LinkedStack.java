package data.structures;

/**
 * Time complexity - push: O(n), pop: O(n)
 */

public class LinkedStack {

    Node first;

    private class Node {

        Node(int data) {
            this.data = data;
        }

        int data;
        Node next;
    }

    public void push(int element) {
        Node temp = new Node(element);
        temp.next = first;
        first = temp;
    }

    public int pop() {
        if (isEmpty()) throw new StackOverflowError();
        int result = first.data;
        first = first.next;
        return result;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
