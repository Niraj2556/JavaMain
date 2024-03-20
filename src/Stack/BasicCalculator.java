package Stack;
import java.util.*;
public class BasicCalculator {
    public int calculate(String s) {
         Stack<Integer> stack = new Stack<>();
        int result = 0;
        int num = 0; // To store the current number
        int sign = 1; // To store the current sign (+1 or -1)

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                // Save the current result and sign on the stack
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                // Evaluate the expression inside the parentheses
                result += sign * num;
                num = 0;
                result *= stack.pop(); // Pop the sign
                result += stack.pop(); // Pop the previous result
            }
        }

        // Don't forget to add the last number (if any)
        result += sign * num;

        return result;
    }

    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        String expression = "1+(2-3)+4";
        int result = calculator.calculate(expression);
        System.out.println("Result: " + result);
    }
}
