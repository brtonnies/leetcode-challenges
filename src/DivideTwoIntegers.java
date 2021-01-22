/*
        CHALLENGE: Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

        --> Return the quotient after dividing dividend by divisor.
        --> The integer division should truncate toward zero, which means losing its fractional part. For example,
            truncate(8.345) = 8 and truncate(-2.7335) = -2.

        Note:
        --> Assume we are dealing with an environment that could only store integers within the 32-bit signed integer
            range: [−231,  231 − 1]. For this problem, assume that your function returns 231 − 1 when the division
            result overflows.
 */


public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (divisor == 0)
            return Integer.MAX_VALUE;

        if (divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        long pDend = Math.abs((long)dividend);
        long pDiv = Math.abs((long)divisor);

        int result = 0;
        while (pDend >= pDiv) {

            int leftShifts = 0;
            while (pDend >= (pDiv << leftShifts))
                leftShifts++;

            result += 1 << (leftShifts - 1);
            pDend -= (pDiv << (leftShifts - 1));
        }

        if (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0)
            return result;
        else
            return -result;
    }


    public static void main(String[] args) {

    }
}
