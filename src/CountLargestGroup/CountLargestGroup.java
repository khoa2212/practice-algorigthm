package CountLargestGroup;

public class CountLargestGroup {

    public static int Solution(int n) {
        if(n < 10) return n;

        int times = 10;
        int max = 1;

        while (n / times > 0) {
            if(n - times < 10) {
                max = n - times + 1;
            }
            else {
                max = times - 1;
            }

            times = times * 10;
        }

        return max;

        // not correct
        // https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
    }
}
