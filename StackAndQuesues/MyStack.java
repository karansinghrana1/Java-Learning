package StackAndQuesues;
import StackAndQuesues.StackExc;

public class MyStack<T> {
    protected Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public MyStack() {
        this(DEFAULT_SIZE); // Use the parameterized constructor
    }

    public MyStack(int size) {
        this.data = new Object[size]; // Create an Object array
    }

    public boolean push(T item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        data[++ptr] = item;
        return true;
    }

    @SuppressWarnings("unchecked")
    public T pop() throws StackExc {
        if (isEmpty()) {
            throw new StackExc("Cannot pop from an empty stack");
        }
        return (T) data[ptr--];
    }

    @SuppressWarnings("unchecked")
    public T peek() throws StackExc {
        if (isEmpty()) {
            throw new StackExc("Cannot peek from an empty stack");
        }
        return (T) data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}