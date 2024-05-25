package Day10;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "([(a+b) + {(c+d) * (e/f)}])";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                if (st.size() > 0 &&st.peek() == '(') {
                    st.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            } else if (ch == '}') {
                if (st.size() > 0 && st.peek() == '{') {
                    st.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            }
            if (ch == ']') {
                if (st.size() > 0 && st.peek() == '[') {
                    st.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            } else {
                if (ch == '(' || ch == '{' || ch == '[') {
                    st.push(ch);
                }
            }

        }

        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
