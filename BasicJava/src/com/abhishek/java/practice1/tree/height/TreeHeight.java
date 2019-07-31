package com.abhishek.java.practice1.tree.height;

import java.util.LinkedList;
import java.util.Queue;

import com.abhishek.java.practice1.tree.Node;

public class TreeHeight {
	Node root;
	Queue<Node> q;
	int max =0;
	
	TreeHeight(){
		q= new LinkedList<>();
	}
	public int heightIterative() {
		if(root==null) return 0;
		int height=0;
		q.add(root);
		while(!q.isEmpty()) {
			Node actualNode = q.poll();
			if(actualNode.left!=null) q.add(actualNode);
		}
		return 0;
	}
	

}
