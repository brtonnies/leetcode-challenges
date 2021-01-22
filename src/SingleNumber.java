/*
        CHALLENGE: Given a non-empty array of integers nums, every element appears twice except for one. Find that
                   single one.

        FOLLOW UP: Could you implement a solution with a linear runtime complexity and without using extra memory?
                                (note: yes. yes, I could and did!)
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[0] = nums[0] ^ nums[i];

        return nums[0];
    }
}
