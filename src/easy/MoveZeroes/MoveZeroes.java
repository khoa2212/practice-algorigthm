package easy.MoveZeroes;

public class MoveZeroes {
    public static void solution(int[] nums) {
        int p1 = 0;
        int p2 = 0;

        while (p2 < nums.length) {
            if(nums[p2] != 0) {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
            }
            p2++;
        }

        while (p1 < nums.length) {
            nums[p1] = 0;
            p1++;
        }
    }
}
