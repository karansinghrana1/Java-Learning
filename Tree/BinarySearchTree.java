public class BinarySearchTree {
    public class Node{
         int val,height;
         Node left,right;

        public Node(int val){
            this.val=val;
        }

        public int getValue(){
            return val;
        }
    }

     Node root;

    public BinarySearchTree(){

    }

    public int getHight(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        // if(root==null){
        //     return true;
        // }
        // return false;

        return root==null;
    }

    public void display(){
        display(root,"root node: ");
    }

    private void display(Node node, String detail) {
        if (node==null) {
            return;
        }
        System.out.println(detail+node.getValue());
        display(node.left,"Left child of "+node.getValue()+" : ");
        display(node.right,"Right child of "+node.getValue()+" : ");
    }

    public void insert(int val){
        root = insert(val, root);
    }
    private Node insert(int val,Node node){

        if (node==null) {
            node=new Node(val);
            return node;
        }
        if(val<node.getValue()){
            node.left=insert(val,node.left);
        }
        if(val>node.getValue()){
            node.right=insert(val,node.right);
        }

        node.height = Math.max(getHight(node.left), getHight(node.right)) + 1;

        return node;


    }

    public boolean balanced(){
       return balanced(root);
    }
    private boolean balanced(Node node){
        if (node==null) {
            return true;
        }
        return Math.abs(getHight(node.left)-getHight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    //if arr is sorted divide in middle and populate left side and right side
    public void populateSorted(int[]nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(mid);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }
}
