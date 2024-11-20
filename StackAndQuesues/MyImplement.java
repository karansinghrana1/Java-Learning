package StackAndQuesues;
import StackAndQuesues.MyStack;

public class MyImplement {
    public static void main(String[]args) throws Exception{
        // MyStack<Integer> st = new MyStack<>(5);
        // st.push(66);
        //  st.push(69);
        //  st.push(76);
        //  st.push(655);
        //  System.out.println(st.pop());
        // MyQueue<String> q = new MyQueue<>();
        // q.insert("affy");
        // q.insert("hai");
        // q.insert("chutiya");
        // q.remove();
        // q.display();
        MyCircularQueue<String> q = new MyCircularQueue<>(5);
        q.insert("affy");
        q.insert("hai");
        q.insert("chutiya");
        q.insert("hhahha");
        q.insert("ummmmm");
        q.remove();
        q.display();

        
         
         
    }
}
