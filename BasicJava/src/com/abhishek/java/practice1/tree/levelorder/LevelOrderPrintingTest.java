package com.abhishek.java.practice1.tree.levelorder;
import com.abhishek.java.practice1.tree.Node;

public class LevelOrderPrintingTest {
	  public static void main(String args[])  
	    { 
	        /* creating a binary tree and entering  
	         the nodes */
	        BinaryTree tree_level = new BinaryTree(); 
	        tree_level.root = new Node(1); 
	        tree_level.root.left = new Node(2); 
	        tree_level.root.right = new Node(3); 
	        tree_level.root.left.left = new Node(4); 
	        tree_level.root.left.right = new Node(5); 
	  
	        System.out.println("Level order traversal of binary tree is - "); 
	        tree_level.printLevelOrder(); 
	    } 

}
