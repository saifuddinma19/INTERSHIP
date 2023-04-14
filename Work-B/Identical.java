import java.io.*;
import java.util.*;
 
public class Identical {
 
    /* A binary tree node */
    static class Node {
        int data;
        Node left, right;
        public Node(int data) { this.data = data; }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
 
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
 
          // Function call
        if (isIdentical(root1, root2)) {
            System.out.println(
                "Both the trees are identical.");
        }
        else {
            System.out.println(
                "Given trees are not identical.");
        }
    }
 
    // Function to check if two trees are identical
    static boolean isIdentical(Node root1, Node root2)
    {
        // Code Here
        // Create two arraylist to store traversals
        ArrayList<Integer> res1 = new ArrayList<Integer>();
        ArrayList<Integer> res2 = new ArrayList<Integer>();
 
        // check inOrder
        inOrder(root1, res1);
        inOrder(root2, res2);
        if (!res1.equals(res2))
            return false;
 
        // clear previous result to reuse arraylist
        res1.clear();
        res2.clear();
        // check PreOrder
        preOrder(root1, res1);
        preOrder(root2, res2);
        if (!res1.equals(res2))
            return false;
 
        // clear previous result to reuse arraylist
        res1.clear();
        res2.clear();
        // check PostOrder
        postOrder(root1, res1);
        postOrder(root2, res2);
        if (!res1.equals(res2))
            return false;
 
        return true;
    }
 
    // Utility function to check inorder traversal
    static void inOrder(Node root, ArrayList<Integer> sol)
    {
        if (root == null)
            return;
        inOrder(root.left, sol);
        sol.add(root.data);
        inOrder(root.right, sol);
    }
 
    // Utility function to check preorder traversal
    static void preOrder(Node root, ArrayList<Integer> sol)
    {
 
        if (root == null)
            return;
        sol.add(root.data);
        preOrder(root.left, sol);
        preOrder(root.right, sol);
    }
 
    // Utility function to check postorder traversal
    static void postOrder(Node root, ArrayList<Integer> sol)
    {
 
        if (root == null)
            return;
        postOrder(root.left, sol);
        postOrder(root.right, sol);
        sol.add(root.data);
    }
}