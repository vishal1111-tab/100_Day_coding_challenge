package Day11;

import java.util.Scanner;
import java.util.Stack;

public class InfixConversion {

    public static int precedence(char optor) {
        if (optor == '+' || optor == '-') {
            return 1;
        } else if (optor == '*' || optor == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        Stack<String> pre = new Stack<>();
        Stack<String> pro = new Stack<>();
        Stack<Character> optor = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                optor.push(ch);
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
                pre.push(ch + "");
                pro.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (optor.size() != 0 && optor.peek() != '(' && precedence(ch) <= precedence(optor.peek())) {
                    char opt = optor.pop();
                    String val2 = pre.pop();
                    String val1 = pre.pop();
                    String val = opt + val1 + val2;
                    pre.push(val);

                    String val4 = pro.pop();
                    String val3 = pro.pop();
                    String vall = val1 + val2 + opt;
                    pro.push(vall);
                }
                optor.push(ch);
            } else if (ch == ')') {
                while (optor.peek() != '(') {
                    char opt = optor.pop();
                    String val2 = pre.pop();
                    String val1 = pre.pop();
                    String val = opt + val1 + val2;
                    pre.push(val);

                    String val3 = pro.pop();
                    String vall = val1 + val2 + opt;
                    pro.push(vall);
                }
                optor.pop();

            }
        }

        while (optor.size() != 0) {
            char opt = optor.pop();
            String val2 = pre.pop();
            String val1 = pre.pop();
            String val = opt + val1 + val2;
            pre.push(val);

            String val3 = pro.pop();
            String vall = val1 + val2 + opt;
            pro.push(vall);
        }

        System.out.println(pre.peek());
        System.out.println(pro.peek());

    }

}
