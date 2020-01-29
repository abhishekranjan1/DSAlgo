package com.abhishek.java.practice1.tree.priyank.tree;

import java.util.ArrayList;
import java.util.List;

public class LinkSiblingsBTree {

    private static int level = 0;

    public static void main(String[] args) {
        Node root = null;
        root = createTree(root);
        List<Node> nodeList = new ArrayList<>();

        connectSiblingsBTree(root, nodeList);
        TreeUtils.traverseTree(root);

        printTree(root);
    }

    private static void printTree(Node root) {
        System.out.println("=================================");
        System.out.println("Level : " + level);
        if(root == null) return;

        System.out.println(root.data);
        if(root.next != null) System.out.print("  Next Info : " + root.next.data);
        else System.out.print("  Next is null  ");
        level++;
        if(root.left != null) printTree(root.left);
        if(root.right!= null) printTree(root.right);

    }

    private static Node createTree(Node root) {
        root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(9);
        root.right.left = new Node(1);
        root.right.right = new Node(32);
        return root;
    }

    private static void connectSiblingsBTree(Node root, List<Node> nodeList) {
        if(root != null) {
            nodeList.add(root);
            TreeUtils.traverseRecusively(nodeList);
        }
    }
}
