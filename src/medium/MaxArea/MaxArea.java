package medium.MaxArea;

public class MaxArea {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left <= right) {
            int heightArea = Math.min(height[left], height[right]);
            int widthArea = right - left;
            int area = heightArea * widthArea;

            if(area > maxArea) maxArea = area;

            if(height[left] > height[right])
                right--;
            else
                left++;
        }

        return maxArea;
    }
}
