package StackAndQuesues;

public class MyQueue<T> {
    protected Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public MyQueue() {
        this(DEFAULT_SIZE); // Use the parameterized constructor
    }

    public MyQueue(int size) {
        this.data = new Object[size]; // Create an Object array
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
    public boolean insert(T item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }

    public T remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Empty");
        }
        T removed = (T)data[0];
        //shift elements

        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public T front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Empty");
        }
        return (T)data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("end");
    }
}
