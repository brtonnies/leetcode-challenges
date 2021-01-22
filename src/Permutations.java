import java.util.ArrayList;
import java.util.List;

/*
        CHALLENGE: Given an array nums of distinct integers, return all the possible permutations. You can return
                   the answer in any order.
 */

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> p = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        for(int j : nums)
            n.add(j);

        p.add(n);
        int[] idx = new int[nums.length];
        int i = 0;
        while (i < nums.length) {
            if (idx[i] < i) {
                swap(nums, i % 2 == 0 ?  0: idx[i], i);
                n = new ArrayList<>();
                for(int j : nums)
                    n.add(j);

                p.add(n);
                idx[i]++;
                i = 0;
            } else {
                idx[i] = 0;
                i++;
            }
        }
        return p;
    }

    private void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
}
