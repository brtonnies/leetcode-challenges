package interview_questions;

import helpers.TreeNode;

/*
        Challenge: Given the root of a binary tree, determine if it is a valid binary search tree (BST).

        A valid BST is defined as follows:
            --> The left subtree of a node contains only nodes with keys less than the node's key.
            --> The right subtree of a node contains only nodes with keys greater than the node's key.
            --> Both the left and right subtrees must also be binary search trees.
 */

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValid(TreeNode node, int min, int max) {
        if (node == null)
            return true;

        if (node.right != null && node.val >= node.right.val)
            return false;

        if (node.left != null && node.val <= node.left.val)
            return false;

        if (node.val < min || node.val > max)
            return false;

        return (isValid(node.left, min, node.val-1) && isValid(node.right, node.val+1, max));
    }
}
