package interview_questions;

import java.util.ArrayList;
import java.util.List;

/*
        CHALLENGE: A self-dividing number is a number that is divisible by every digit it contains.

            --> For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
            --> Also, a self-dividing number is not allowed to contain the digit zero.
            --> Given a lower and upper number bound, output a list of every possible self dividing number, including
                the bounds if possible.
 */

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ret = new ArrayList<>();

        for(int i = left; i <= right; i++) {
            boolean selfdiv = true;
            int n = i;

            while (n > 0 && selfdiv) {
                if (n % 10 == 0)
                    selfdiv = false;
                else if (i % (n % 10) != 0)
                    selfdiv = false;

                n /= 10;
            }

            if (selfdiv)
                ret.add(i);

        }

        return ret;
    }
}
