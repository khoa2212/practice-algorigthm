package easy.MakeStringGreat;


import java.util.Stack;

public class MakeStringGreat {
    public static String Solution(String input) {
        Stack<Character> stack = new Stack<>();
        stack.push(input.charAt(0));
        Character b = stack.peek();
        for(int i = 1; i < input.length(); i++) {
            Character c = input.charAt(i);
            if(b != null && Math.abs(b - c) == 32) {
                stack.pop();
            }
            else {
                stack.push(c);
            }

            if(!stack.empty())
                b = stack.peek();
            else
                b = null;
        }

        String result = "";

        for(Character c : stack) {
            result = result + c;
        }

        return result;
    }
}
