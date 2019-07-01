package com.abhishek.java.practice1.tree.levelorder;

import java.util.LinkedList;
import java.util.Queue;

import com.abhishek.java.practice1.tree.Node;

public class BinaryTree {
	Node root;
	Queue<Node> queue;
	BinaryTree(){
		queue = new LinkedList<>();
	}
public void printLevelOrder() {
	queue.add(root);
	while(!queue.isEmpty()) {
		Node actualNode = queue.poll();
		System.out.println(actualNode.data+", ");
		if(actualNode.left!=null)  queue.add(actualNode.left);
		if(actualNode.right!=null) queue.add(actualNode.right);
	}
	}
}
