/*
        CHALLENGE: Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */

public class SubtractProductAndSumOfDigitsOfInteger {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }

        return product - sum;
    }
}
