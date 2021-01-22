/*
        CHALLENGE: A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding
                   the number itself. A divisor of an integer x is an integer that can divide x evenly.

            --> Given an integer n, return true if n is a perfect number, otherwise return false.
 */

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num == 0) return false;

        int sum = 0;

        for(int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num / i == i)
                    sum += i;
                else
                    sum += (num / i == num ? 0 : num / i) + i;
            }
        }

        return sum == num;
    }
}
