package com.abhishek.java.practice1.tree;

public class Node {
	public int data;
	public Node right;
	public Node left;
	public Node nextRight;
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
}
