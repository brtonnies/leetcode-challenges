package interview_questions;/*
        CHALLENGE: Given an array nums of integers, return how many of them contain an even number of digits.
 */

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums)
            if (numDigits(n) % 2 == 0)
                count++;

        return count;
    }

    private int numDigits(int n) {
        // THIS IS SO UGLY BUT SO FAST!
        return n < 100000 ? n < 100 ? n < 10 ? 1 : 2
                : n < 1000 ? 3 : n < 10000 ? 4 : 5
                : n < 10000000 ? n < 1000000 ? 6 : 7
                : n < 100000000 ? 8 : n < 1000000000 ? 9 : 10;
    }
}
