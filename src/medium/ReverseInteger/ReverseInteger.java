package medium.ReverseInteger;

public class ReverseInteger {
    public static int solution(int x) {
        boolean isNegative = x < 0;
        String s = Integer.valueOf(Math.abs(x)).toString();
        StringBuilder reverse = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }

        try {
            int res = Integer.parseInt(reverse.toString());
            if(isNegative) res = res * -1;
            return res;
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
}
