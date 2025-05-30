package datastructures.stacks;

import datastructures.interfaces.Queue;
import datastructures.lists.CustomLinkedList;

public class CustomStack<T> implements Queue<T> {
    private CustomLinkedList<T> list;

    public CustomStack() {
        list = new CustomLinkedList<>();
    }

    @Override
    public boolean add(Object t) {
        list.addLast((T) t);
        return true;
    }

    @Override
    public boolean offer(Object t) {
        return add(t);
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    @Override
    public T poll() {
        return isEmpty() ? null : list.removeFirst();
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    @Override
    public T peek() {
        return isEmpty() ? null : list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }


}