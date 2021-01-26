package interview_questions;/*
        CHALLENGE: Given an integer array nums where every element appears three times except for one, which appears
                   exactly once. Find the single element and return it.
 */

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        int c = 0;
        int one = 0;
        int two = 0;

        for(int i = 0; i < nums.length; i++) {
            two = two | (one & nums[i]);
            one = one ^ nums[i];
            c = ~(one & two);
            one &= c;
            two &= c;
        }

        return one;
    }
}
