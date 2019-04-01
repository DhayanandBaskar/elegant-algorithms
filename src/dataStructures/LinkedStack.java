package dataStructures;

/**
 * Time complexity - push: O(1), pop: O(1)
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
