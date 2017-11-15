package queue;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Queue<T extends Comparable<T>> implements Iterable<T>, iQueue<T>{

    private T[]data         = null;
    private Class<T> type   = null;
    private int front       = -1;
    private int back        = 0;
    private int count       = 0;

    public Queue(Class<T> type){
        data = (T[]) Array.newInstance(type, 10);
        this.type = type;
    }
    public Queue(Class<T> type, int size){
        data = (T[])Array.newInstance(type,size);
        this.type=type;
    }


    @Override
    public void queue(T value) throws QueueFullException {

    }

    @Override
    public T deQueue() throws QueueEmptyException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T front() throws QueueEmptyException {
        return null;
    }

    @Override
    public T search(T value) throws QueueEmptyException {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean frontOf(T value, int priority) throws QueueFullException {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
