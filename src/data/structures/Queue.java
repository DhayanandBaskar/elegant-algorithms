package data.structures;

import java.util.NoSuchElementException;

/**
 * Time complexity - push: O(1), pop: O(1)
 */

public class Queue {

    private class Node {

        Node(int data) {
            this.data = data;
        }

        int data;
        Node next;
    }

    Node first;
    Node last;

    public void enqueue(int element) {
        Node old = last;
        last = new Node(element);
        if (isEmpty()) first = last;
        else old.next = last;
    }

    public int dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        int result = first.data;
        first = first.next;
        return result;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
