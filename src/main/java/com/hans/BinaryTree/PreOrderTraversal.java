package com.hans.BinaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

public class PreOrderTraversal {

    // Recursive Solution
    public void preOder(TreeNode root){
        if(root != null){
            System.out.printf("%d ",root.data);
            preOder(root.leftNode);
            preOder(root.rightNode);
        }
    }

    // Iterative solution
    public void preOderItr(TreeNode root){
        if(root == null)
            return;

        Stack<TreeNode> stackNode = new Stack<TreeNode>();
        stackNode.push(root);

        while (!stackNode.empty()){

            TreeNode n = stackNode.pop();
            System.out.printf("%d ", n.data);

            if(n.rightNode != null){
                stackNode.push(n.rightNode);
            }
            if(n.leftNode !=null){
                stackNode.push(n.leftNode);
            }

        }
    }

    public static void main(String[] args) {
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();

        //---Create Binary Tree
        TreeNode treeNode = createTreeNode();

        System.out.println("Using Recursive Solution");
        preOrderTraversal.preOder(treeNode);
        System.out.println();

        System.out.println("Using Iterative Solution");
        preOrderTraversal.preOderItr(treeNode);

    }

    public static TreeNode createTreeNode(){

        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.leftNode = node20;
        rootNode.rightNode = node60;

        node20.leftNode = node10;
        node20.rightNode = node30;

        node60.leftNode = node50;
        node50.rightNode = node70;

        return rootNode;
    }
}
