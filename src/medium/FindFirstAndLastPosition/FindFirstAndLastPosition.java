package medium.FindFirstAndLastPosition;

//O(logn) use binarySearch
public class FindFirstAndLastPosition {
    public static int[] solution2(int[] nums, int target) {
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

    public static int[] solution(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;

        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] == target) {
                res[0] = mid;
                res[1] = mid;

                int l = mid - 1;
                int r = mid + 1;

                while (l >= 0 && nums[l] == target) {
                    res[0] = l;
                    l--;
                }

                while (r < nums.length && nums[r] == target) {
                    res[1] = r;
                    r++;
                }

                return res;
            }
            else if(nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return res;
    }
}
