package medium.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public static String Solution(String s) {
        if(s.length() <= 1) return s;
        int maxLen = 1;
        String longestSubstring = s.substring(0, 1);

        for(int i = 0; i < s.length(); i++) {
            // odd length "a 'b' a"

            int left = i;
            int right = i;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
                if(s.substring(left, right + 1).length() > maxLen) {
                    longestSubstring = s.substring(left, right + 1);
                    maxLen = right - left;
                }
                left --;
                right++;
            }

            // even length "a 'bb' a"
            left = i;
            right = i + 1;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
                if(s.substring(left, right + 1).length() > maxLen) {
                    longestSubstring = s.substring(left, right + 1);
                    maxLen = right - left;
                }
                left --;
                right++;
            }
        }

        return longestSubstring;
    }
}
