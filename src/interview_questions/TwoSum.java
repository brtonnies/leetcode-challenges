package interview_questions;

import java.util.HashMap;

/*
        CHALLENGE: Given an array of integers nums and an integer target, return indices of the two numbers such
                   that they add up to target.

            --> You may assume that each input would have exactly one solution, and you may not use the same
                element twice.
            --> You can return the answer in any order.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[] { map.get(target - nums[i]), i };
            else
                map.put(nums[i], i);

        }
        return null;
    }
}
