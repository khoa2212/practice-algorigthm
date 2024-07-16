package easy.CountLargestGroup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLargestGroup {

    public static int Solution(int n) {
        int[] t = new int[n + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= n; i++){
            t[i] = i % 10 + t[i / 10];
            map.put(t[i], map.getOrDefault(t[i], 0) + 1);
        }

        int max = 0;
        int totalGroups = 0;

        // find max and frequency of max
        for(int key : map.keySet()){
            if(map.get(key) > max) {
                max = map.get(key);
                totalGroups = 1;
            } else if(map.get(key) == max){
                totalGroups++;
            }
        }
        return totalGroups;
    }
}
