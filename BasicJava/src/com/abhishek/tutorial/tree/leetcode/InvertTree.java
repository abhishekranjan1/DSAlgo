package com.abhishek.tutorial.tree.leetcode;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        swap(root.left,root.right);
        invertTree(root.left);
        invertTree(root.right);
        return root;
//        TreeNode temp = left;
//        left = invertTree(right);
//        right = invertTree(temp);
//        return root;
        //Input: [4,2,7,1,3,6,9]
        //Expected: [4,7,2,9,6,3,1]
    }

    private void swap(TreeNode left, TreeNode right) {
        TreeNode temp = left;
        left = invertTree(right);
        right = invertTree(temp);

    }
}
