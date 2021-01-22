/*
        CHALLENGE: Given a positive integer num consisting only of digits 6 and 9.
            --> Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 */

public class Maximum69Number {
    public int maximum69Number (int num) {
        int max = num;
        int[] digits = new int[numDigits(num)];

        int i = 0;
        while (num > 0) {
            digits[i] = num % 10;
            num /= 10;
            i++;
        }

        for (i = 0; i < digits.length; i++) {
            int v = 0;
            digits[i] = digits[i] == 6 ? 9 : 6;

            if (asNumber(digits) > max)
                max = asNumber(digits);

            digits[i] = digits[i] == 6 ? 9 : 6;
        }

        return max;
    }

    private int asNumber(int[] digits) {
        int num = 0;

        for(int i = 0; i < digits.length; i++)
            num += digits[i] * Math.pow(10,i);

        return num;
    }

    private int numDigits(int n) {
        // THIS IS SO UGLY BUT SO FAST!
        return n < 100000 ? n < 100 ? n < 10 ? 1 : 2
                : n < 1000 ? 3 : n < 10000 ? 4 : 5
                : n < 10000000 ? n < 1000000 ? 6 : 7
                : n < 100000000 ? 8 : n < 1000000000 ? 9 : 10;
    }
}
