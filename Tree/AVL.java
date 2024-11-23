public class AVL extends BinarySearchTree {
    public AVL(){
        super();
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

        return rotate(node);


    }

    private Node rotate(Node node){
        //left heavy
        if(getHight(node.left)-getHight(node.right)>1){
            //left left case
            if(getHight(node.left.left)-getHight(node.left.right)>0){
                return rightRotate(node);
            }
            //left right case
            if(getHight(node.left.left)-getHight(node.left.right)<0){
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        //right heavy
        if(getHight(node.left)-getHight(node.right)<-1){
            //right right case
            if(getHight(node.right.left)-getHight(node.right.right)<0){
                return leftRotate(node);
            }
            //left right case
            if(getHight(node.right.left)-getHight(node.right.right)>0){
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        
        return  node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right=p;
        p.left=t;

        p.height=Math.max(getHight(p.left),getHight(p.right))+1;
        c.height=Math.max(getHight(c.left),getHight(c.right))+1;
        return c;
    }

    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        
        p.left=c;
        c.right=t;

        p.height=Math.max(getHight(p.left),getHight(p.right))+1;
        c.height=Math.max(getHight(c.left),getHight(c.right))+1;
        return p;
    }


}
