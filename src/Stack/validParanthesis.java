package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class validParanthesis {
         static boolean areBracketsBalanced(String str)
        {
            // Using ArrayDeque is faster than using Stack class
            Deque<Character> stack = new ArrayDeque<>();

            // Traversing the Expression
            for (int i = 0; i < str.length(); i++) {
                char x = str.charAt(i);

                if (x == '(' || x == '[' || x == '{') {
                    // Push the element in the stack
                    stack.push(x);
                    continue;
                }

                if (stack.isEmpty())
                    return false;


                char check;
                switch (x) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }

            // Check Empty Stack
            return (stack.isEmpty());
        }

        // Driver code
        public static void main(String[] args)
        {
            String expr = "([{}])";

            // Function call
            if (areBracketsBalanced(expr))
                System.out.println("Balanced ");
            else
                System.out.println("Not Balanced ");
        }
    }


