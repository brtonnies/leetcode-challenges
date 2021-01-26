package interview_questions;/*
        CHALLENGE: Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 */

public class AddDigits {
    public int addDigits(int num) {
        return num == 0 ? 0 : num % 9 == 0 ? 9 : num % 9;
    }
}
