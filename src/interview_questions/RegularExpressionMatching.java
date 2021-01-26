package interview_questions;/*
    Challenge: Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*' where:
        --> '.' Matches any single character.​​​​
        --> '*' Matches zero or more of the preceding element.
        --> The matching should cover the entire input string (not partial).
 */

import java.util.regex.Pattern;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        return Pattern.matches(p, s);
    }

    public static void main(String[] args) {
        RegularExpressionMatching reg = new RegularExpressionMatching();

        String input1 = "aa";
        String input2 = "a";
        boolean output = false;

        boolean ret = reg.isMatch(input1, input2);

        if (ret == output)
            System.out.println("TEST CASE PASSED");
        else
            System.out.println("TEST CASE FAILED");
    }
}
