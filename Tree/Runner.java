import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Scanner scanner =new Scanner(System.in);
        // BinaryTree tree=new BinaryTree();
        // tree.populate(scanner);
        // tree.prettyDisplay();

        // BinarySearchTree bst = new BinarySearchTree();
        // int[] nums = {5,2,7,1,4,6,9,8,3,10};
        // bst.populate(nums);
        // bst.display();
        
        // AVL tree = new AVL();
        
        // for (int i = 0; i < 1000; i++) {
        //     tree.insert(i);
        // }

        int[] arr={3,8,6,7,-2,-8,4,9};

        SegmentTree tree = new SegmentTree(arr);
        // tree.display();
        System.out.println(tree.query(1, 6));

        
    }
}
