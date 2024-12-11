import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take infix expression as input
        System.out.print("Enter infix expression: ");
        String infix = scanner.nextLine();

        // Convert to postfix
        String postfix = convertToPostfix(infix);
        System.out.println("Postfix: " + postfix);

        scanner.close();
    }

    public static String convertToPostfix(String infix) {
        char[] stack = new char[infix.length()];
        int top = -1; // Simulate the top of the stack
        StringBuilder postfix = new StringBuilder();

        // 1. Read infix from left to right
        for (int i = 0; i < infix.length(); i++) {
            char read = infix.charAt(i);

            // 2.1 If read is '(' push on "stack"
            if (read == '(') {
                stack[++top] = read; // Increment top and add to "stack"
            }
            // 2.2 If read is ')', pop until '(' is removed
            else if (read == ')') {
                while (top != -1 && stack[top] != '(') {
                    postfix.append(stack[top--]); // Append and decrement top
                }
                top--; // Remove '(' but don't append to postfix
            }
            // 2.3 If read is an operator
            else if (isOperator(read)) {
                while (top != -1 && precedence(stack[top]) >= precedence(read)) {
                    postfix.append(stack[top--]); // Append and pop
                }
                stack[++top] = read; // Push new operator
            }
            // 2.4 If read is an operand, copy to postfix
            else if (Character.isLetterOrDigit(read)) {
                postfix.append(read);
            }
        }

        // 3. Copy any remaining operators from the "stack" to postfix
        while (top != -1) {
            postfix.append(stack[top--]);
        }

        // 4. Return the postfix expression
        return postfix.toString();
    }

    // Helper method to check if a character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // Helper method to get the precedence of an operator
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
            case '%':
                 return 3;
            default:
                return -1; // Invalid operator
        }
    }
}
