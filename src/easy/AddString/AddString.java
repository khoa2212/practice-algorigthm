package easy.AddString;

public class AddString {
    public static String solution(String num1, String num2) {
        int curIndexNum1 = num1.length() - 1;
        int curIndexNum2 = num2.length() - 1;
        StringBuilder s = new StringBuilder();
        int remain = 0;

        while (curIndexNum1 != -1 && curIndexNum2 != -1) {
            int sum = (num1.charAt(curIndexNum1) - '0') + (num2.charAt(curIndexNum2) - '0') + remain;
            s.insert(0, String.valueOf(sum % 10));
            remain = sum / 10;
            curIndexNum1--;
            curIndexNum2--;
        }

        while (curIndexNum1 != -1) {
            int sum = (num1.charAt(curIndexNum1) - '0') + remain;
            s.insert(0, String.valueOf(sum % 10));
            remain = sum / 10;
            curIndexNum1--;
        }

        while (curIndexNum2 != -1) {
            int sum = (num2.charAt(curIndexNum2) - '0') + remain;
            s.insert(0, String.valueOf(sum % 10));
            remain = sum / 10;
            curIndexNum2--;
        }

        if (remain != 0)
            s.insert(0, remain);

        return s.toString();
    }
}
