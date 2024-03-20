package HashMap;

import java.util.*;

public class repeatedSubstringPattern {
     public static boolean repeatedSubstringPattern(String s) {

            int len = s.length();

            for (int i = 1; i <= len / 2; i++) {
                if (len % i == 0) {
                    String substring = s.substring(0, i);
                    StringBuilder sb = new StringBuilder();

                    // Append multiple copies of the substring
                    for (int j = 0; j < len / i; j++) {
                        sb.append(substring);
                    }


                    // If the constructed string matches the original string, return true
                    if (sb.toString().equals(s)) {
                        return true;
                    }
                }
            }

            return false;
        }

        public static void main(String[] args) {
            String input1 = "abab";
            String input2 = "abcabcabc";
            String input3 = "aabaaba";

//            System.out.println(repeatedSubstringPattern(input1)); // Output: true
            System.out.println(repeatedSubstringPattern(input2)); // Output: true
//            System.out.println(repeatedSubstringPattern(input3)); // Output: false

            List<Integer> list = new LinkedList<>();


        }
//





//
//    public static boolean repeatedSubstring(String s) {
//        int len = s.length();
//         if(len%2 != 0) return false;
//        int newVal = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < len; i++) {
//            if (map.containsKey(s.charAt(i))) {
//                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//            } else {
//                map.put(s.charAt(i), 1);
//            }
//        }
//        for (int value : map.values()) {
//            newVal += value;
//        }
//
//        if (map.isEmpty()) {
//            return true; // If the map is empty, all values are technically equal
//        }
//
//        // Get the first value in the map
//        Integer firstValue = map.values().iterator().next();
//
//        // Compare the first value with all other values
//        for (Integer value : map.values()) {
//            if (!Objects.equals(firstValue, value)) {
//                return false; // Values are not all equal
//            }
//        }
//
//        return true;


//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() % 2 == 0) {
//                return true;
//            }
//        }
//        return false;
    }
//
//    public static void main(String[] args) {
//
//        String a = "ababab";
//
//        System.out.println(repeatedSubstring(a));
//    }

//}
