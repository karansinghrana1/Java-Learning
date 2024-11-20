package LikedList;

public class Main {
    public static void main(String[] args) {
        LL linkedlist = new LL();
        
        

        for (int i = 0; i < 10; i++) {
            linkedlist.insertAtFirst(i);
        }
        linkedlist.insert(5, 3);
        linkedlist.display();
        // linkedlist.insertAtLast(99);
        // linkedlist.insert(555, 6);
        // linkedlist.display();
        // // System.out.println(linkedlist.deleteFirst());
        // // System.out.println(linkedlist.deleteLast());
        // // System.out.println(linkedlist.delete(5));
        // linkedlist.display();

        // DLL linkedlist = new DLL();
        // for (int i = 0; i < 10; i++) {
        //     linkedlist.insertFirst(i);
        // }
        // linkedlist.insertLast(100);
        // linkedlist.insert(100, 101);
        // linkedlist.display();

        
        // CLL linkedlist = new CLL();
        // for (int i = 0; i < 10; i++) {
        //     linkedlist.insert(i);
        // }
        // linkedlist.delete(9);
        // linkedlist.delete(2);
        // linkedlist.delete(0);
        // linkedlist.display();

        
    }
}
