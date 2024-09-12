package com.study.leetCode;

public class PathSum {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(11);
        node.right.left = new TreeNode(13);
        node.right.right = new TreeNode(4);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);
        node.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(node,22));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(targetSum-root.val == 0 && root.left == null && root.right == null){
            return true;
        }

        return hasPathSum(root.left,targetSum- root.val) || hasPathSum(root.right, targetSum- root.val);
    }


}
