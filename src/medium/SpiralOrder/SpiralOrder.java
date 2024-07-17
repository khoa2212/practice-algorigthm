package medium.SpiralOrder;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> solution (int [][] matrix) {
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        List<Integer> res = new ArrayList<>();

        while (left <= right && top <= bottom) {
            // move to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            // minimize rectangle border top
            top++;

            // move down
            for (int j = top; j <= bottom; j++) {
                res.add(matrix[j][right]);
            }
            // minimize rectangle border right
            right--;

            if(left > right || top > bottom)
                break;

            // move to left
            for (int k = right; k >= left; k--) {
                res.add(matrix[bottom][k]);
            }
            // minimize rectangle border bottom
            bottom--;

            // move up
            for (int l = bottom;  l >= top; l--) {
                res.add(matrix[l][left]);
            }
            // minimize rectangle border left
            left++;
        }

        return res;
    }
}
