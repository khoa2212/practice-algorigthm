import easy.AddString.AddString;
import easy.FindLuckyInteger.FindLuckyInteger;
import easy.MoveZeroes.MoveZeroes;
import medium.LongestPalindromicSubstring.LongestPalindromicSubstring;
import medium.ReverseInteger.ReverseInteger;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {0};
        MoveZeroes.solution(nums);

        System.out.println(Arrays.toString(nums));
    }
}