package com.abhishek.tutorial.tree;

import com.abhishek.tutorial.tree.common.Node;
public class BinaryTree {

	public Node root;
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		if(root==null)
		{
			root=newNode;
			newNode.left=newNode.right=null;
			return;
		}
			Node current=root;
			Node parent=root;

		while(current!=null){
			parent = current;
			if(current.getData() > data)  current = current.left;
			else current = current.right;
		}

		if(parent.getData() > data) parent.left = newNode;
		else  parent.right = newNode;
		}

public void inOrderTraversal(Node current)
{
	if(current!=null)
	{
		inOrderTraversal(current.left);
		System.out.println(current.getData());
		inOrderTraversal(current.right);
	}
}

public void preOrderTraversal(Node current)
{
	if(current!=null)
	{
		System.out.println(current.getData());
		preOrderTraversal(current.left);
		preOrderTraversal(current.right);
	}
}

public void postOrderTraversal(Node current)
{
	if(current!=null)
	{
		postOrderTraversal(current.left);
		postOrderTraversal(current.right);
		System.out.println(current.getData());
	}
}
	
public Node removeNode(int data)
{
	Node current=root;
	Node parent=root;
	boolean isLeftChild=true;
	//Next part is to search for the node only
	while(current.getData()!=data)
	{
		parent=current;
		if(data<current.getData())
		{
			isLeftChild=true;
			current=current.left;
			
		}
		else
		{
			isLeftChild=false;
			current=current.right;
		}
		// If the NODE is not found
		if(current==null)
		{
			System.out.println("Node NOT found");
			return null;
		}
		//If the NODE has no children
		else if(current.left==null &&current.right==null)
		{
			if(current==root)
			{
				root=null;
				return current;
			}
			else
			{
				if(isLeftChild)
				{
					parent.left = null;
				}
				else
				{
					parent.right=null;
				}
				
			}
		}
		
		//If the NODE has only right children
		else if(current.left==null)
		{
			if(current==root)
			{
				root=current.right;
				return current;
			}
			else
			{
				if(isLeftChild)
				{
					parent.left=current.right;
				}
				else
				{
					parent.right=current.right;
				}
				
			}
		}
		
		//If the NODE has only left children
		else if(current.right==null)
		{
			if(current==root)
			{
				root=current.left;
				return root;
			}
			else
			{
				if(isLeftChild)
				{
					parent.left=current.left;
				}
				else
				{
					parent.right=current.left;
				}
				
			}
		}
		
		//If the NODE has both left and right children
		else
		{
			if(current==root)
			{
				current.right.left=root.left;
				root=current.right;
				return current;
			}
			else
			{
				if(isLeftChild)
				{
					parent.left=current.right;
					current.right.left=current.left;
				}
				else
				{
					parent.right=current.right;
					current.right.left=current.left;
				}
				
			}
		}
		
	}
	return current;
}

public int height(Node root){
		if(root==null){
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1+Math.max(leftHeight,rightHeight);
}

public int kLowest(Node root, int k){

	int[] nums = new int[2];
	inorder(root,k,nums);
	return nums[1];
}

	private void inorder(Node root, int k, int[] nums) {
		if(root==null) return;

			inorder(root.left,k,nums);
			if(++nums[0]==k){
				nums[1]=root.data;
				return;
			}
			inorder(root.right,k,nums);

	}


}
