package com.study.leetCode;

public class SymmetricTree {

    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root){

        if(root == null){
            return false;
        }
       return check(root.right,root.left);
    }

    public static boolean check(TreeNode right, TreeNode left){
        if(right ==null && left ==null){
            return true;
        }
        if(right == null || left == null){
            return false;
        }

        if(left.val != right.val){
            return false;
        }
        return check(right.right,left.left) &&
                check(right.left, left.right);
    }

}
