package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList data;

    public Stack() {
        this.data = new ImmutableLinkedList();
    }

    public Stack(Stack stack) {
        this.data = stack.data;
    }
    public Object peek() {
        return this.data.getLast();
    }

    public Object pop(){
        Object res = this.data.getLast();
        this.data= data.removeLast();
        return res;

    }
    void push(Object e){
        this.data = data.addLast(e);
    }

}
