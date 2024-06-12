package TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static int[] Solution(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int[] indexs = new int[0];

        for(int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], i);
        }
        System.out.println(myMap);

        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if(myMap.containsKey(res) && myMap.get(res) != i) {
                indexs = new int[2];
                indexs[0] = i;
                indexs[1] = myMap.get(res);
                return indexs;
            }
        }

        return indexs;
    }
}
