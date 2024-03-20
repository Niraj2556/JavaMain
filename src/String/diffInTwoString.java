package String;

import java.util.HashMap;
import java.util.Map;

public class diffInTwoString {
    public static char findTheDifference(String s, String t) {
        Map<Character , Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch , 1);
            }
        }

        char ch = 'e';
        for(int i = 0; i<t.length(); i++){
            ch = t.charAt(i);
            if(!map.containsKey(ch)){
                return ch;
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}
