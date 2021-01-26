package interview_questions;

import helpers.TreeNode;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        TreeNode head = recursiveHelper(nums, 0, nums.length - 1);

        return head;
    }

    public TreeNode recursiveHelper (int[] nums, int low, int high) {
        if (low > high)
            return null;

        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = recursiveHelper(nums, low, mid - 1);
        node.right = recursiveHelper(nums, mid + 1, high);

        return node;
    }

    public static void main(String[] args) {
        int[] input = { -10, -3, 0, 5, 9 };


    }
}
