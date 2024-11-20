package StackAndQuesues;

public class MyCircularQueue<T> {
    protected Object[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0,front=0,size=0;

    public MyCircularQueue() {
        this(DEFAULT_SIZE); // Use the parameterized constructor
    }

    public MyCircularQueue(int size) {
        this.data = new Object[size]; // Create an Object array
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(T item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end = end%data.length;
        size++;
        return true;
    }
    public T remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Empty");
        }
        T removed = (T)data[front++];
        front=front%data.length;
        size--;
        
        return removed;
    }
    public T front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Empty");
        }
        return (T)data[front];
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.print("END");
    }

}
