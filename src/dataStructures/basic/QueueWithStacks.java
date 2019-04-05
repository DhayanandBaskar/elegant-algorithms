package dataStructures.basic;

public class QueueWithStacks {
    private Stack input;
    private Stack output;

    public void enqueue(int element) {
        input.push(element);
    }

    public int dequeue() {
        if(output.isEmpty()) {
            while(!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }
}
