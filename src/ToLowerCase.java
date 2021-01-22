/*
        CHALLENGE: Implement function ToLowerCase() that has a string parameter str, and returns the same string
                   in lowercase.
 */


public class ToLowerCase {
    public String toLowerCase(String str) {
        char[] ret = str.toCharArray();
        for(int i = 0; i < ret.length; i++)
            ret[i] = (int)ret[i] <= 90 && (int)ret[i] >= 65  ? (char)((int)ret[i] + 32) : ret[i];

        return String.valueOf(ret);
    }
}
