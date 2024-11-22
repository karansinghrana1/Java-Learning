import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        int val;
        Node left,right;

        Node(int val){
            this.val=val;
        }
    }

    private Node root;

    //Insert elements

    public  void populate(Scanner scanner){
        System.out.println("enter root node value");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);

    }
    public  void populate(Scanner scanner,Node node){
        System.out.println("Do You want to enter left of "+node.val);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter value left of "+node.val);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do You want to enter right of "+node.val);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("enter value right of "+node.val);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }
    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent){
        if (node==null) {
            return;
        }
        System.out.println(indent+node.val);
        display(node.left , indent+"\t");
        display(node.right,indent+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node,int level){
        if (node==null) {
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.val);
        }else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level+1);
        
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return ;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return ;
        }
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return ;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }



}
