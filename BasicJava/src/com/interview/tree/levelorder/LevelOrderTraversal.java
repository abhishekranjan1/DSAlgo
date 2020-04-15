package com.interview.tree.levelorder;

import com.interview.tree.nodedefinition.BinaryTree;
import com.interview.tree.nodedefinition.Node;

import java.util.*;

public class LevelOrderTraversal {

    public static void main(String[] args){
        BinaryTree tree =new BinaryTree();
        tree.addNode(12);
        tree.addNode(9);
        tree.addNode(20);
        tree.addNode(15);
        tree.addNode(7);
        tree.addNode(6);
        tree.addNode(13);
        tree.addNode(14);
//        List<List<Integer>> paths =  levelOrder(tree.root);

//        List<List<Integer>> paths =  leftSideViewOrder(tree.root);
//        List<List<Integer>> paths =  rightSideViewOrder(tree.root);
//        List<List<Integer>> paths =  zigzagOrder(tree.root);
//
//        int level = 0;
//        for(List<Integer> path : paths){
//            for(int i : path){
//                System.out.print(i+"-> ");
//            }
//            System.out.println();
//            level++;
//        }

        System.out.println(verticalOrder(tree.root));
        System.out.println("TOP View ->"+topView(tree.root));
        System.out.println("BOTTOM View ->"+bottomView(tree.root));
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> paths = new ArrayList<>();
        if(root==null) return paths;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> currentPath = new ArrayList<>();
            int levelSize = queue.size();
            for(int i=0; i< levelSize; i++)
            {
                Node node = queue.remove();
                currentPath.add(node.data);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            paths.add(currentPath);

        }
        return paths;
    }

    public static List<List<Integer>> leftSideViewOrder(Node root) {
        List<List<Integer>> paths = new ArrayList<>();
        if(root==null) return paths;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> currentPath = new ArrayList<>();
            int levelSize = queue.size();
            currentPath.add(queue.peek().data);
            for(int i=0; i< levelSize; i++)
            {
                Node node = queue.remove();
               // currentPath.add(node.data);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            paths.add(currentPath);

        }
        return paths;
    }

    public static List<List<Integer>> rightSideViewOrder(Node root) {
        List<List<Integer>> paths = new ArrayList<>();
        if(root==null) return paths;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> currentPath = new ArrayList<>();
            int levelSize = queue.size();
            for(int i=0; i< levelSize-1; i++)
            {
                Node node = queue.remove();
                //currentPath.add(node.data);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            //Next piece of code is to push last node into the list
            Node node = queue.remove();
            currentPath.add(node.data);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);

            paths.add(currentPath);

        }
        return paths;
    }

    public static List<List<Integer>> zigzagOrder(Node root) {
        List<List<Integer>> paths = new ArrayList<>();
        if(root==null) return paths;

        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();
        queue1.add(root);
        boolean leftToRight = false;
        while(!queue1.isEmpty()){
            List<Integer> currentPath = new ArrayList<>();
            int levelSize = queue1.size();
                for (int i = 0; i < levelSize; i++) {
                    Node node = queue1.remove();
                    currentPath.add(node.data);
                    if(leftToRight){
                        if (node.right != null) queue1.add(node.right);
                        if (node.left != null) queue1.add(node.left);}
                    else{
                        if (node.left != null) queue1.add(node.left);
                        if (node.right != null) queue1.add(node.right);
                }
            }
            paths.add(currentPath);
            ;
        }
        return paths;
    }

    public static Map<Integer, List<Node>> verticalOrder(Node root) {
        Map<Integer, List<Node>> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        root.setHd(0);
        queue.add(root);
        map.put(root.getHd(),new ArrayList<Node>(){{add(root);}});
        while(!queue.isEmpty()){
                Node node = queue.remove();
                if(node.left!=null) {
                    node.left.setHd(node.getHd()-1);
                    queue.add(node.left);
                    if(!map.containsKey(node.left.getHd())){
                        List<Node> temp = new ArrayList<Node>(){{
                                        add(node.left);
                        }
                        };
                        map.put(node.left.getHd(), temp);
                    }
                    else{
                        map.get(node.left.getHd()).add(node.left);
                    }
                }
            if(node.right!=null) {
                node.right.setHd(node.getHd()+1);
                queue.add(node.right);
                if(!map.containsKey(node.right.getHd())){
                    List<Node> temp = new ArrayList<Node>(){{
                        add(node.right);
                    }
                    };
                    map.put(node.right.getHd(), temp);
                }
                else{
                    map.get(node.right.getHd()).add(node.right);
                }
            }
            }

        return map;
        }

    public static Map<Integer, Node> topView(Node root) {
        Map<Integer, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        root.setHd(0);
        queue.add(root);
        map.put(root.getHd(),root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            if(node.left!=null) {
                node.left.setHd(node.getHd() - 1);
                queue.add(node.left);
                map.putIfAbsent(node.left.getHd(), node.left);
            }
            if(node.right!=null) {
                node.right.setHd(node.getHd()+1);
                queue.add(node.right);
                map.putIfAbsent(node.right.getHd(), node.right);
            }
        }
        return map;
    }

    public static Map<Integer, Node> bottomView(Node root) {
        Map<Integer, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        root.setHd(0);
        queue.add(root);
        map.put(root.getHd(),root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            if(node.left!=null) {
                node.left.setHd(node.getHd() - 1);
                queue.add(node.left);
                map.put(node.left.getHd(), node.left);
            }
            if(node.right!=null) {
                node.right.setHd(node.getHd()+1);
                queue.add(node.right);
                map.put(node.right.getHd(), node.right);
            }
        }
        return map;
    }
}
