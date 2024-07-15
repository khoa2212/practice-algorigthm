package easy.CountLargestGroup;

import java.util.HashMap;
import java.util.Map;

public class CountLargestGroup {

    public static int Solution(int n) {
        int[] t = new int[n+1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            t[i] = i%10 + t[i/10];
            map.put(t[i], map.getOrDefault(t[i], 0) + 1);
        }
        int max = 0;
        int ans = 0;

        for(int key : map.keySet()){
            if(map.get(key) > max) {
                max = map.get(key);
                ans = 1;
            } else if(map.get(key) == max){
                ans++;
            }
        }
        return ans;

        // not correct
        // https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
        // https://leetcode.com/problems/remove-palindromic-subsequences/
    }
}
