package interview_questions;/*
        CHALLENGE:  Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

        The algorithm for myAtoi(string s) is as follows:
            --> Read in and ignore any leading whitespace.
            --> Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character
                in if it is either. This determines if the final result is negative or positive respectively. Assume
                the result is positive if neither is present.
            --> Read in next the characters until the next non-digit charcter or the end of the input is reached. The
                rest of the string is ignored.
            --> Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then
                the integer is 0. Change the sign as necessary (from step 2).
            --> If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so
                that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and
                integers greater than 231 - 1 should be clamped to 231 - 1.
            --> Return the integer as the final result.

        Note:
            --> Only the space character ' ' is considered a whitespace character.
            --> Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 */


public class StringToInteger {

    public int myAtoi(String str) {
        int index = 0, sign = 1, total = 0;

        if (str.length() == 0)
            return 0;

        while (index < str.length() && str.charAt(index) == ' ')
            index++;

        if (index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        if (index < str.length() && !Character.isDigit(str.charAt(index)))
            return 0;

        int result = 0;
        while (index < str.length()) {
            if (!Character.isDigit(str.charAt(index)))
                break;

            char current = str.charAt(index++);
            int previous = result;
            result *= 10;

            if (previous != result/10)
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            result += (current - '0');

            if (result < 0)
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        }
        return result * sign;
    }


    public static void main(String[] args) {
        StringToInteger test = new StringToInteger();
        String input = "   -96";
        int output = -96;

        if (test.myAtoi(input) == output)
            System.out.println("TEST CASE PASSED");
        else
            System.out.println("TEST CASE FAILED");
    }
}
