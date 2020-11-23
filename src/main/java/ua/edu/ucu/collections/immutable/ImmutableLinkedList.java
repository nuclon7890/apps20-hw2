package ua.edu.ucu.collections.immutable;
import java.util.ArrayList;
import java.util.LinkedList;

public class ImmutableLinkedList implements ImmutableList{
    private final LinkedList<Object> data;

    public ImmutableLinkedList() {
        this.data = new LinkedList<>();
    }

    public ImmutableLinkedList(ImmutableLinkedList other) {
        this.data = (LinkedList<Object>) other.data.clone();
    }

    public ImmutableLinkedList(LinkedList<Object> other_data) {
        this.data = (LinkedList<Object>) other_data.clone();
    }



    @Override
    public ImmutableList add(Object e) {
        LinkedList<Object> res = new LinkedList<>(this.data);
        res.add(e);
        return new ImmutableLinkedList(res);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        LinkedList<Object> res = new LinkedList<>(this.data);
        res.add(index, e);
        return new ImmutableLinkedList(res);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        LinkedList<Object> res = new LinkedList<>(this.data);
        for (int i = 0; i < this.data.size(); i++) {
            res.add(c[i]);
        }
        return null;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        LinkedList<Object> res = new LinkedList<>(this.data);
        for (int i = 0; i < this.data.size(); i++) {
            res.add(index + i, c[i]);
        }
        return new ImmutableLinkedList(res);
    }

    @Override
    public Object get(int index) {
        return this.data.get(index);
    }

    @Override
    public ImmutableList remove(int index) {
        LinkedList<Object> res = new LinkedList<>(this.data);
        res.remove(index);
        return new ImmutableLinkedList(res);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        LinkedList<Object> res = new LinkedList<>(this.data);
        res.set(index, e);
        return new ImmutableLinkedList(res);
    }

    @Override
    public int indexOf(Object e) {
        return this.data.indexOf(e);
    }

    @Override
    public int size() {
        return this.data.size();
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override
    public Object[] toArray() {
        return this.data.toArray();
    }
    public ImmutableLinkedList addFirst(Object e){
        LinkedList<Object> res = new LinkedList<>(this.data);
        res.addFirst(e);
        return new ImmutableLinkedList(res);
    }
    public ImmutableLinkedList addLast(Object e){
        LinkedList<Object> res = new LinkedList<>(this.data);
        res.addLast(e);
        return new ImmutableLinkedList(res);
    }
    public Object getFirst(){
        return this.data.getFirst();
    }
    public Object getLast(){
        return this.data.getLast();
    }
    public ImmutableLinkedList removeFirst(){
        LinkedList<Object> res = new LinkedList<>(this.data);
        res.removeFirst();
        return new ImmutableLinkedList(res);

    }
    public ImmutableLinkedList removeLast(){
        LinkedList<Object> res = new LinkedList<>(this.data);
        res.removeLast();
        return new ImmutableLinkedList(res);
    }
}
