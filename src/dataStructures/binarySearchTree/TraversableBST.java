package dataStructures.binarySearchTree;

import dataStructures.basic.Queue;

public class TraversableBST extends BinarySearchTree {
    public Queue inOrderKeys() {
        Queue queue = new Queue();
        inOrder(root, queue);
        return queue;
    }

    public Queue preOrderKeys() {
        Queue queue = new Queue();
        preOrder(root, queue);
        return queue;
    }

    public Queue postOrderKeys() {
        Queue queue = new Queue();
        postOrder(root, queue);
        return queue;
    }

    private void inOrder(BinarySearchTree.Node x, Queue queue) {
        if(x == null) return;
        inOrder(x.left, queue);
        queue.enqueue(x.key);
        inOrder(x.right, queue);
    }

    private void preOrder(Node x, Queue queue) {
        if(x == null) return;
        queue.enqueue(x.key);
        preOrder(x.left, queue);
        preOrder(x.right, queue);
    }

    private void postOrder(Node x, Queue queue) {
        if(x == null) return;
        postOrder(x.left, queue);
        postOrder(x.right, queue);
        queue.enqueue(x.key);
    }
}
