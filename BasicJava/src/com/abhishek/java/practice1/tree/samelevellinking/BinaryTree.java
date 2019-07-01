package com.abhishek.java.practice1.tree.samelevellinking;

public class BinaryTree {

	    Node root; 
	   
	    // Sets the nextRight of root and calls connectRecur() 
	    // for other nodes 
	    void connect(Node p)  
	    { 
	   
	        // Set the nextRight for root 
	        p.nextRight = null; 
	   
	        // Set the next right for rest of the nodes (other 
	        // than root) 
	        connectRecur(p); 
	    } 
	   
	    /* Set next right of all descendents of p. 
	       Assumption:  p is a compete binary tree */
	    void connectRecur(Node p)  
	    { 
	        // Base case 
	        if (p == null) 
	            return; 
	   
	        // Set the nextRight pointer for p's left child 
	        if (p.left != null) 
	            p.left.nextRight = p.right; 
	   
	        // Set the nextRight pointer for p's right child 
	        // p->nextRight will be NULL if p is the right most child  
	        // at its level 
	        if (p.right != null)  
	            p.right.nextRight = (p.nextRight != null) ?  
	                                         p.nextRight.left : null; 
	   
	        // Set nextRight for other nodes in pre order fashion 
	        connectRecur(p.left); 
	        connectRecur(p.right); 
	    } 

}
