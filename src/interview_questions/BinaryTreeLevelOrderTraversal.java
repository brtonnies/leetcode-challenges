package interview_questions;

import helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root==null)
            return result;

        LinkedList<TreeNode> nodes = new LinkedList<>();
        LinkedList<Integer> levels = new LinkedList<>();

        nodes.offer(root);
        levels.offer(1);

        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            int level = levels.poll();

            List<Integer> l = null;
            if (result.size() < level){
                l = new ArrayList<>();
                result.add(l);
            } else
                l = result.get(level-1);

            l.add(node.val);

            if (node.left != null) {
                nodes.offer(node.left);
                levels.offer(level+1);
            }

            if (node.right != null) {
                nodes.offer(node.right);
                levels.offer(level+1);
            }
        }

        return result;
    }
}
