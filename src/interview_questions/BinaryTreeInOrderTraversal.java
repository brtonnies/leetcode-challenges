package interview_questions;

import helpers.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
        CHALLENGE: Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */

public class BinaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;

        while (node != null || stack.size() > 0) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }

        return list;
    }
}
