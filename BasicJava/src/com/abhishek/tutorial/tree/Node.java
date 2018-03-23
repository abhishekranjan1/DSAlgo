package com.abhishek.tutorial.tree;

public class Node {
	
	int data;
	Node left;
	Node right;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node(int data) {
		super();
		this.data = data;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	public static void main(String[]Args)
	{
		
		BinaryTree tree =new BinaryTree();
		tree.addNode(23);
		tree.addNode(85);
		tree.addNode(54);
		tree.addNode(12);
		tree.addNode(34);
		tree.addNode(112);
		tree.inOrderTraversal(tree.root);
	}

}
