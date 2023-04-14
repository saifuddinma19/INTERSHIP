import java.util.*;

class Mirror {

// a binary tree node has data, pointer to
// left child and a pointer to right child
static class Node {
    int data;
    Node left;
    Node right;
}

// function that allocates
// a new node with the given data and null left and right pointers
static Node newNode(int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.left = null;
    newNode.right = null;
    return newNode;
}

// function to print Inorder traversal
static void inorder(Node root) {
    if (root == null)
        return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}


static Node mirror(Node root) {
    if (root == null) {
        return null;

    }
    // mirror the subtrees
    Node mirror = newNode(root.data);
    mirror.right = mirror(root.left);
    mirror.left = mirror(root.right);
    return mirror;
}

public static void main(String args[]) {

    Node root = newNode(1); 
    root.left = newNode(2); 
    root.right = newNode(3); 
    root.left.left = newNode(4); 
    root.left.right = newNode(5); 
    root.right.left = newNode(6);
    root.right.right = newNode(7);

    //  inorder traversal of the input tree
    System.out.print("Inorder traversal of original tree is \n");
    inorder(root);

    Node mirror = null;
    mirror = mirror(root);

    // inorder traversal of the mirrored tree
    System.out.print("\nInorder traversal of the mirrored tree is \n");
    inorder(mirror);
    }
}