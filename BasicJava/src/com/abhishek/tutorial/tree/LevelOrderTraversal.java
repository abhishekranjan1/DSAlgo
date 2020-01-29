package com.abhishek.tutorial.tree;

import com.abhishek.tutorial.tree.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return null;
        List<List<Integer>> paths = new ArrayList<>();
        levelOrder(root, paths);
        return paths;
    }
    void levelOrder(TreeNode root, List<List<Integer>> paths){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> pathLavel  = new ArrayList<>();
            for(int i=0; i< levelSize; i++){
                TreeNode node = queue.remove();
                pathLavel.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }

            paths.add(pathLavel);
        }



    }
}
