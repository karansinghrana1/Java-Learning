package LikedList;

public class DLL {
    Node head;

    public void insertFirst(int val){
       Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null) {
            head.prev=node;  
        }
        head = node;   
    }
  public void insertLast(int val){
    Node node = new Node(val);
    Node temp = head;
    if(head==null){
        node.prev=null;
        head=node;
        node.next=null;
        return;
    }

    while (temp.next!=null) {
        temp = temp.next;
    }
    temp.next=node;
    node.prev=temp;
  }
  public void insert(int after, int val) {
    Node p = find(after); // Find the node after which we want to insert
    if (p == null) {
        System.out.println("Node with value " + after + " does not exist.");
        return;
    }
    Node node = new Node(val); // Create a new node
    node.next = p.next; // Set the next of the new node to p's next

    if (p.next != null) {
        p.next.prev = node; // Update the prev of the next node if it exists
    }
    
    p.next = node; // Link p's next to the new node
    node.prev = p; // Link the new node's prev to p
}

public Node find(int val) {
    Node node = head;
    while (node != null) {
        if (node.value == val) {
            return node; // Return the node if the value matches
        }
        node = node.next;
    }
    return null; // Return null if the value is not found
}

  public void display(){
        Node temp = head;
        Node last = null;
        while (temp!=null) {
            System.out.print(temp.value+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("ENd");

        // display reverse

        while (last!=null) {
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.println("ENd");
    }

    private class Node {
        private int value;
        Node next,prev;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        
    }
}
