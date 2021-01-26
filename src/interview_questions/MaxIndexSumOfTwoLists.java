package interview_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
        CHALLENGE: Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of
                   favorite restaurants represented by strings.
            --> You need to help them find out their common interest with the least list index sum. If there is a
                choice tie between answers, output all of them with no order requirement. You could assume there
                always exists an answer.
 */

public class MaxIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer, List<String>> common = new HashMap<>();

        for(int i = 0; i < list1.length; i++)
            for(int j = 0; j < list2.length; j++)
                if (list1[i].equals(list2[j])) {
                    common.putIfAbsent(i+j, new ArrayList<String>());
                    common.get(i+j).add(list1[i]);
                }

        int minIndexSum = list1.length + list2.length - 1;
        for (int key : common.keySet())
            minIndexSum = key < minIndexSum ? key : minIndexSum;

        return common.get(minIndexSum).toArray(new String[common.get(minIndexSum).size()]);
    }
}
