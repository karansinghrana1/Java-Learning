package StackAndQuesues;

public class MyDynamicStack<T> extends MyStack<T> {
    public MyDynamicStack() {
        super();
    }

    public MyDynamicStack(int size) {
        super(size);
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean push(T item) {
        if (isFull()) {
            T[] temp = (T[]) new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = (T) data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
