package com.study.leetCode;

public class SameTree {

    public static void main(String[] args) {
        TreeNode tnp = new TreeNode(1);
        tnp.left = new TreeNode(2);


        TreeNode tnq = new TreeNode(1);

        tnq.right= new TreeNode(2);

        isSameTree(tnp, tnq);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        else if(p==null || q==null) return false;

        if(p.val==q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        else return false;
    }




}
