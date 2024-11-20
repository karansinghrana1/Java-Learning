package StackAndQuesues;

public class MyDyanamicQueue<T> extends MyCircularQueue<T> {
    public MyDyanamicQueue() {
        super();
    }

    public MyDyanamicQueue(int size) {
        super(size);
    }
    @Override
    public boolean insert(T item) {
        if (isFull()) {
            T[] temp = (T[]) new Object[data.length * 2];
            for (int i =0 ; i < data.length; i++) {
                temp[i] = (T) data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
