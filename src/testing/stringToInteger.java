package testing;

import java.math.BigInteger;

public class stringToInteger {
    public static int myAtoi(String s) {
        s = s.trim();
        boolean checkNegative = false;
        int answer = 0;
        int i = 0;

        if (s.length() == 0) {
            return 0;
        }

        if (s.charAt(0) == '-') {
            checkNegative = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            int digit = Character.getNumericValue(c);
            if (answer > (Integer.MAX_VALUE - digit) / 10) {
                return checkNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            answer = answer * 10 + digit;
        }

        return checkNegative ? -answer : answer;
    }



//    public static int myAtoi(String s) {
//        s = s.trim();
//        StringBuilder st = new StringBuilder();
//        char[] arr = s.toCharArray();
//
//        if (s.isEmpty()) {
//            return 0;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (Character.isDigit(arr[i]) || (i == 0 && (arr[i] == '-' || arr[i] == '+'))) {
//                st.append(arr[i]);
//            } else {
//                break;
//            }
//        }
//
//        if (st.length() == 0 || (st.length() == 1 && (st.charAt(0) == '-' || st.charAt(0) == '+'))) {
//            return 0;
//        }
//
//        BigInteger result = new BigInteger(st.toString());
//
//        if (result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
//            return Integer.MAX_VALUE;
//        } else if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
//            return Integer.MIN_VALUE;
//        }
//
//        System.out.println(((Object)result).getClass().getSimpleName());
//        return result.intValue();
//    }

    public static void main(String[] args) {
        String hello = "drfghj";
        System.out.println(myAtoi(hello));
    }

}
