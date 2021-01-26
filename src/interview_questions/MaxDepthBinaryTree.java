package interview_questions;

import helpers.TreeNode;

/*
        CHALLENGE: Given the root of a binary tree, return its maximum depth.
            --> A binary tree's maximum depth is the number of nodes along the longest path from the root node down
                to the farthest leaf node.
 */

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }
}
