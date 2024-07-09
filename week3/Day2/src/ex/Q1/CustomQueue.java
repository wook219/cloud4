package ex.Q1;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue<E> {
    private final Queue<E> queue;

    public CustomQueue() {
        queue = new LinkedList<>();
    }

    public void add(E element) {
        printAction("add");
        queue.add(element);
    }

    public E poll() {
        printAction("poll");
        return queue.poll();
    }

    public int size() {
        printAction("size");
        return queue.size();
    }

    public Boolean isEmpty() {
        printAction("isEmpty");
        return queue.isEmpty();
    }

    private void printAction(String action) {
        System.out.println(action);
    }
}
