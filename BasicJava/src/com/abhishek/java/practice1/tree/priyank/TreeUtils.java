package com.abhishek.java.practice1.tree.priyank;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils {
	
	  public static void traverseRecusively(List<Node> nodeList){

	        List<Node> childNodes = getAllChildNodes(nodeList);
	        if(childNodes.size() > 0){
	            connectAllNodes(childNodes);
	            traverseRecusively(childNodes);
	        }
	        return;
	    }
	  
	  public static List<Node> getAllChildNodes(List<Node> nodeList){
	        List<Node> childNodes = new ArrayList<>();
	        for(Node node : nodeList){
	            if(node.left != null)
	                childNodes.add(node.left);
	            if(node.right != null){
	                childNodes.add(node.right);
	            }
	        }
	        return childNodes;
	  }

    public static void connectAllNodes(List<Node> nodeList){
        for(int i=0 ; i <= nodeList.size()-2; i++){
            nodeList.get(i).next = nodeList.get(i+1);
        }
        nodeList.get(nodeList.size()-1).next = null;
    }


    public static Node addchildToBTree(Node parent, Node left, Node right){
        if(parent == null) return null;
        if(left != null) parent.left = left;
        if(right != null) parent.right = right;

        return parent;
    }

    public static Node getNewNode(int data){
        return new Node(data);
    }

    public static void traverseTree(Node node){
        if(node == null) return;

        System.out.println(node.data);
        if(node.left != null) traverseTree(node.left);
        if(node.right != null)  traverseTree(node.right);
    }
}
