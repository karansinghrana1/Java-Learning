public class SegmentTree {
   class Node{
        int data,startInterval,endInterval;
        Node left,right;

        public Node(int startInterval,int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }
    Node root;

    public SegmentTree(int[] arr){
        //create tree using array
        this.root=constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr,int start,int end){
        if(start==end){
            Node leaf=new Node(start, end);
            leaf.data=arr[start];
            return leaf;
        }

        //create node all index u are at
        Node node=new Node(start, end);
        int mid=(start+end)/2;
        node.left=constructTree(arr, start, mid);
        node.right=constructTree(arr, mid+1, end);
        node.data=node.left.data+node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }
    private void display(Node node) {
        if (node == null) {
            return;
        }
    
        String str = "";
    
        // Left child
        if (node.left != null) {
            str += "Interval [" + node.left.startInterval + "," + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str += "no left child => ";
        }
    
        // Current node
        str += "Interval [" + node.startInterval + "," + node.endInterval + "] and data: " + node.data + " <= ";
    
        // Right child
        if (node.right != null) {
            str += "Interval [" + node.right.startInterval + "," + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str += "no right child";
        }
    
        System.out.println(str+'\n');
    
        // Recurse
        display(node.left);
        display(node.right);
    }
    

    public int query(int start,int end){
        return this.query(this.root,start, end);
    }
    private int query(Node node,int start,int end){
        if(node.startInterval>=start&&node.endInterval<=end){
            return node.data;
        }
        else if (node.startInterval>end || node.endInterval<start) {
            return 0;
        }
        else{
            return this.query(node.left,start, end) + this.query(node.right,start, end);
        }
    }

    public void update(int index,int val){
        this.root.data= update(this.root,index, val);
    }
    private int update(Node node,int index,int val){
        if (index>=node.startInterval && index<=node.endInterval) {
            if (index==node.startInterval && index==node.endInterval) {
                node.data=val;
                return node.data;
            }
            else{
                node.data=update(node.left, index, val)+update(node.right, index, val);
                return node.data;
            }
        }
        return val;
    }




}
