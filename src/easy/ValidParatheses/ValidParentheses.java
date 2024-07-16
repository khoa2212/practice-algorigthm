package easy.ValidParatheses;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean Solution(String s) {
        Stack<Character> st = new Stack<>();
        int i = 1;
        st.push(s.charAt(0));

        HashMap<Character, Character> validPairParentheses = new HashMap<>();
        validPairParentheses.put(')', '(');
        validPairParentheses.put(']', '[');
        validPairParentheses.put('}', '{');

        while (i < s.length()) {
            if((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && !st.isEmpty()) {
                Character a = st.lastElement();
                if(a != validPairParentheses.get(s.charAt(i))) {
                    return false;
                }
                else {
                    st.pop();
                }
            }
            else {
                st.push(s.charAt(i));
            }
            i++;

        }

        return st.isEmpty();
    }
}
