package String;

import java.util.*;

public class removeDuplicate {
    public static String removeDuplicateLetters(String s) {
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            if(!ans.contains(ch)){
                ans.add(String.valueOf(ch));
//            }
        }
        String result = String.join("", ans);
        return result;
    }

    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
}
