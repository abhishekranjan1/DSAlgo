package com.abhishek.java.practice1.tree.samelevellinking;

import java.util.LinkedList;
import java.util.Queue;

public class SameLevelLinkingWithQueue {
	Node root;
	Queue<Node> q;
	SameLevelLinkingWithQueue(){
		q = new LinkedList<>();
	}
	public void LinkNodesAtSameLevel() {
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			for(int i=0;i<q.size()-1;i++) {
				Node actualNode = q.poll();
				if(actualNode!=null) {	
					actualNode.nextRight = q.peek();			
					if(actualNode.left!=null) q.add(actualNode.left);
					if(actualNode.right!=null) q.add(actualNode.right);			
					}										
			} 
			q.add(null);				
		}		
	}
}
