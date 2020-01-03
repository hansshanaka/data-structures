package com.hans.BinaryTree;

public class PostOderTraversal {

    //--Recursive Solution
    public void postOrder(TreeNode root){
        if(root !=null){
            postOrder(root.leftNode);
            postOrder(root.rightNode);
            //---
            System.out.printf("%d ",root.data);
        }
    }

    //--Iterative Solution
    public void postOderItr(){
        
    }

    public static void main(String[] args) {

        PostOderTraversal postOderTraversal = new PostOderTraversal();
        TreeNode root = createBinaryTree();
        System.out.println("Recursion Solution");
        postOderTraversal.postOrder(root);

    }

    public static TreeNode createBinaryTree(){
        TreeNode root = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        root.leftNode = node20;
        root.rightNode = node60;

        node20.leftNode = node10;
        node20.rightNode = node30;

        node60.leftNode = node50;
        node60.rightNode = node70;

        return root;
    }
}
