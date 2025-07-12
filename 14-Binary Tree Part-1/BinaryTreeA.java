//import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data){
       this.data=data;
    }

    public static void printTree(BinaryTreeNode root){ // Added root parameter
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left); // Recursive call with left child
        printTree(root.right); // Recursive call with right child
    }
}

public class BinaryTreeA {
    public static void main(String[] args) {
        // Creating the nodes
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode rootL = new BinaryTreeNode(2);
        BinaryTreeNode rootR = new BinaryTreeNode(3);
        BinaryTreeNode rootLL = new BinaryTreeNode(4);
        BinaryTreeNode rootLR = new BinaryTreeNode(5);

        // Connecting the nodes to form the tree structure
        root.left = rootL;
        root.right = rootR;

        rootL.left = rootLL;
        rootL.right = rootLR; // Connecting rootLR to rootL

        System.out.println("Printing the tree (Pre-order traversal):");
        BinaryTreeNode.printTree(root);
        

    }
}
