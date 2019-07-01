package com.abhishek.java.practice1.tree.samelevellinking;

public class SameLevelLinkerWithQueueClient {
	public static void main(String args[])  
    { 
		SameLevelLinkingWithQueue tree = new SameLevelLinkingWithQueue(); 
          
        /* Constructed binary tree is 
             10 
            /  \ 
          8     2 
         / \   / \
        3   9 1  32
        */
        
		tree.root = new Node(10); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(9); 
        tree.root.right.left = new Node(1); 
        tree.root.right.right = new Node(32); 
   
        // Populates nextRight pointer in all nodes 
        tree.LinkNodesAtSameLevel(); 
   
        // Let us check the values of nextRight pointers 
        System.out.println("Following are populated nextRight pointers in "
                + "the tree" + "(-1 is printed if there is no nextRight)"); 
        int a = tree.root.nextRight != null ? tree.root.nextRight.data : -1; 
        System.out.println("nextRight of " + tree.root.data + " is "
                + a); 
        int b = tree.root.left.nextRight != null ?  
                                    tree.root.left.nextRight.data : -1; 
        System.out.println("nextRight of " + tree.root.left.data + " is "
                + b); 
        int c = tree.root.right.nextRight != null ?  
                                   tree.root.right.nextRight.data : -1; 
        System.out.println("nextRight of " + tree.root.right.data + " is "
                + c); 
        int d = tree.root.left.left.nextRight != null ?  
                              tree.root.left.left.nextRight.data : -1; 
        System.out.println("nextRight of " + tree.root.left.left.data + " is "
                + d);  
    }

}
