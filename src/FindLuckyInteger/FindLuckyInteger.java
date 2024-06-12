package FindLuckyInteger;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyInteger {
    public static int Solution(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(myMap.containsKey(arr[i])) {
                 int sum = myMap.get(arr[i]) + 1;
                 myMap.put(arr[i], sum);
            }
            else {
                myMap.put(arr[i], 1);
            }
        }

        int maxLuckyNum = -1;
        System.out.println(myMap);

        for ( Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if(entry.getKey() == entry.getValue() && entry.getKey() > maxLuckyNum) {
                maxLuckyNum = entry.getKey();
            }
        }

        return maxLuckyNum;
    }
}
