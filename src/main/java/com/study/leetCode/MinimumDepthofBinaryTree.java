package com.study.leetCode;

import com.sun.source.tree.Tree;

public class MinimumDepthofBinaryTree {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(5);
        node.right.right.right.right = new TreeNode(6);

        System.out.println(minDepth(node));

    }
    public static int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left == null){
          return  minDepth(root.right) +1;
        }
        if(root.right == null){
          return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

}
