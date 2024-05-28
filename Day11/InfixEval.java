package Day11;

import java.util.Scanner;
import java.util.Stack;

public class InfixEval {

    public static int precedence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') {
            return 1;
        } else if (optor == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static int operation(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        System.out.println(exp);

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> opotors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                opotors.push(ch);
            } else if (Character.isDigit(ch)) {
                opnds.push(ch - '0');
            } else if (ch == ')') {
                while (opotors.peek() != '(') {
                    char optor = opotors.pop();

                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int value = operation(v1, v2, optor);
                    opnds.push(value);

                }
                opotors.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (opotors.size() > 0 && opotors.peek() != '(' && precedence(ch) <= precedence(opotors.peek())) {
                    char optor = opotors.pop();

                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int value = operation(v1, v2, optor);
                    opnds.push(value);
                }
                opotors.push(ch);

            }
        }

        while (opotors.size() != 0) {
            char optor = opotors.pop();

            int v2 = opnds.pop();
            int v1 = opnds.pop();
            int value = operation(v1, v2, optor);
            opnds.push(value);
        }

        System.out.println(opnds.peek());


    }

}
