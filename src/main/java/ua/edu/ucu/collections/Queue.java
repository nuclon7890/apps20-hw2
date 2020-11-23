package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList data;

    public Queue() {
        this.data = new ImmutableLinkedList();
    }

    public Queue(Queue queue) {
        this.data = queue.data;
    }


    public Object peek() {
        return this.data.getFirst();
    }

    public Object dequeue() {
        Object res = this.data.getFirst();
        this.data = data.removeFirst();
        return res;

    }

    public void enqueue(Object e) {
        this.data = data.addLast(e);

    }

}
