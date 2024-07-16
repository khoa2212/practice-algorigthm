package medium.FindFirstAndLastPosition;

public class FindFirstAndLastPosition {
    public int[] solution(int[] nums, int target) {
        int[] res = new int[2];
        int p1 = -1;
        int p2 = -1;

        for (int i = 0; i < nums.length; i++) {
            if(p1 == -1 && nums[i] == target) {
                p1 = i;
                p2 = i;
            }
            else if(p1 != -1 && nums[i] == target) {
                p2 = i;
            }
        }

        res[0] = p1;
        res[1] = p2;

        return res;
    }
}
