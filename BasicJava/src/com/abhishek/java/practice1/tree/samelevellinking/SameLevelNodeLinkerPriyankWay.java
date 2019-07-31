package com.abhishek.java.practice1.tree.samelevellinking;

import java.util.ArrayList;
import java.util.List;

public class SameLevelNodeLinkerPriyankWay {
	Node root;
	
	public void linkSamelevelNodes(List<Node> nodes) {
		//First we will get the child nodes of all the current Node
		List<Node> childNodes = getAllchildNodes(nodes);
		while(!childNodes.isEmpty()) {
		// While all the childNodes are not empty, we link all the children at the same level
			linkAllChildNodesAtSameLevel(childNodes);
			//Repeat the same process for the children of the current Nodes ie at the next level
			linkSamelevelNodes(childNodes);			
		}
	}

	private void linkAllChildNodesAtSameLevel(List<Node> childNodes) {
		// TODO Auto-generated method stub
		for(int i=0; i<childNodes.size()-2;i++) {
			
		}
		
	}

	private List<Node> getAllchildNodes(List<Node> nodes) {
		List<Node> childNodes = new ArrayList<>();
		for(Node node:nodes) {
			if(node.left!=null) childNodes.add(node);
			if(node.right!=null) childNodes.add(node);
			}
		return childNodes;
		}
	}


