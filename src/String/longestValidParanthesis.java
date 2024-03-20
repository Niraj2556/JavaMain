package String;

import java.util.*;

public class longestValidParanthesis {
    public static int longestValidParentheses(String s) {
        int len = s.length();
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;

        stack.push(-1); // Push a dummy index to handle the beginning

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

//    public static int longestValidParentheses(String s) {
//        int len = s.length();
//        Stack<Character> st = new Stack<>();
//        int count = 0;
//        for (int i = 0; i < len; i++) {
//            char ch = s.charAt(i);
//
//            if (ch == '('){
//                st.push(ch);
//            }
//            else if(ch == ')' && st.size() != 0) {
//                    st.pop();
//                    count += 2;
//                }
//
//            }
//
//        return count;
//    }
    public static void main(String[] args) {

        String pop = "(()";

        System.out.println(longestValidParentheses(pop));
    }
}
