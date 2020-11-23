package ua.edu.ucu.collections.immutable;

import java.util.ArrayList;

public class ImmutableArrayList implements ImmutableList {

    private final ArrayList<Object> data;

    public ImmutableArrayList() {
        this.data = new ArrayList<>();
    }

    public ImmutableArrayList(ImmutableArrayList other) {
        this.data = (ArrayList<Object>) other.data.clone();
    }

    public ImmutableArrayList(ArrayList<Object> other_data) {
        this.data = (ArrayList<Object>) other_data.clone();
    }

    @Override
    public ImmutableList add(Object e) {
        ArrayList<Object> res = new ArrayList<>(this.data);
        res.add(e);
        return new ImmutableArrayList(res);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        ArrayList<Object> res = new ArrayList<>(this.data);
        res.add(index, e);
        return new ImmutableArrayList(res);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        ArrayList<Object> res = new ArrayList<>(this.data);
        for (int i = 0; i < this.data.size(); i++) {
            res.add(c[i]);
        }
        return new ImmutableArrayList(res);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        ArrayList<Object> res = new ArrayList<>(this.data);
        for (int i = 0; i < this.data.size(); i++) {
            res.add(index + i, c[i]);
        }
        return new ImmutableArrayList(res);
    }

    @Override
    public Object get(int index) {
        return this.data.get(index);
    }

    @Override
    public ImmutableList remove(int index) {
        ArrayList<Object> res = new ArrayList<>(this.data);
        res.remove(index);
        return new ImmutableArrayList(res);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        ArrayList<Object> res = new ArrayList<>(this.data);
        res.set(index, e);
        return new ImmutableArrayList(res);
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
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {

        return this.data.isEmpty();
    }

    @Override
    public Object[] toArray() {

        return this.data.toArray();
    }

}
