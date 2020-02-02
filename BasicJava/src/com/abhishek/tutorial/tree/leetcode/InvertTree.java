package com.abhishek.tutorial.tree.leetcode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
        //Input: [4,2,7,1,3,6,9]
        //Expected: [4,7,2,9,6,3,1]
    }
}
