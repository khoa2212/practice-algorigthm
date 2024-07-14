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
            if (isNegative) res = res * -1;
            return res;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int solution2(int x) {
        try {
            boolean isNegative = x < 0;
            int res = 0;
            int times = 10;
            while(Math.abs(x) > 0) {
                int lastDigit = Math.abs(x) % 10;
                res = res * times + lastDigit;
                x = Math.abs(x) / 10;
            }
            if (isNegative) res = res * -1;
            return res;
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
}
