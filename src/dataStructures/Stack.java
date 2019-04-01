package dataStructures;

/**
 * Time complexity - push: O(n), pop: O(n)
 */

public class Stack {
    int index = -1;
    int[] array;

    Stack(int n) {
        array = new int[n];
    }

    public void push(int element) {
        array[++index] = element;
    }

    public int pop() {
        return array[index--];
    }

    public boolean isEmpty() {
        return index == -1;
    }
}
