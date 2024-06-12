package ShuffleTheArray;

public class ShuffleTheArray {
    public static int[] Solution(int[] nums, int n) {
        int[] res = new int[n * 2];
        int l = 0;
        int r = n;
        int i = 0;

        while (l < n) {
            res[i] = nums[l];
            res[i + 1] = nums[r];
            l++;
            r++;
            i = i + 2;
        }

        return res;
    }
}
