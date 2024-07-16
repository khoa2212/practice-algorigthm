package easy.RomanToInt;

import java.util.HashMap;

public class RomanToInt {
    public static int solution(String s) {
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
        if (s.isEmpty()) return 0;

        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        if (s.length() == 1) return map.get(s);

        int res = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int first = map.get(Character.toString(s.charAt(i)));
            int next = map.get(Character.toString(s.charAt(i + 1)));

            if(first >= next) {
                res = res + first;
            }
            else {
                res = res - first;
            }
        }

        res = res + map.get(Character.toString(s.charAt(s.length() - 1)));

        return res;
    }
}
