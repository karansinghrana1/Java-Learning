package StackAndQuesues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuild {
    public static void main(String[] args) {
    //   Stack<Integer> st = new Stack<>();
    //      st.push(66);
    //      st.push(69);
    //      st.push(76);
    //      st.push(655);
    //      System.out.println(st.pop());
    //      System.out.println(st.pop());
    //      System.out.println(st.pop());
    //      System.out.println(st.pop());
        // Queue<Integer> q = new LinkedList<>();
        // q.add(10);
        // q.add(1);
        // q.add(11);
        // q.add(20);
        // System.out.println(q.remove()  );
        Deque<Integer> d = new ArrayDeque<>();
        d.add(10);
        d.addFirst(120);
        d.addFirst(11);
        d.removeFirst();
        d.removeLast();

    
    }
}
