package interview_questions;

import helpers.TreeNode;

/*
        CHALLENGE: Given a binary tree, determine if it is height-balanced.

        For this problem, a height-balanced binary tree is defined as:
            --> A binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 */

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if (Math.abs(height(root.right) - height(root.left)) <= 1 && isBalanced(root.right) && isBalanced(root.left))
            return true;

        return false;
    }

    private int height(TreeNode node) {
        if (node == null)
            return 0;

        return 1 + Math.max(height(node.left), height(node.right));
    }
}
