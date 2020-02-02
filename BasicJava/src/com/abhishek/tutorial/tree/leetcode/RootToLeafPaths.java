package com.abhishek.tutorial.tree.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        dfs(root,"",paths);
        return paths;
    }
    void dfs(TreeNode root, String path, List<String> paths){
        if(root == null) return;
        path +=root.val;
        if(root.left==null && root.right==null)
        {
            paths.add(path);
            return;
        }
        dfs(root.left,path+"->", paths);
        dfs(root.right,path+"->",paths);
    }
}
