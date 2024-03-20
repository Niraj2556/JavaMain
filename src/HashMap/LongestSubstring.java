package HashMap;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {




                                     //USING -- HASHMAP --->   Map<Character, Integer> charMap = new HashMap<>();
//        int n = s.length();
//        int maxLength = 0;
//        Map<Character, Integer> charMap = new HashMap<>();
//        int val = 0;
//        for(int i = 0; i < n; i++) {
//            if (!charMap.containsKey(s.charAt(i)) || charMap.get(s.charAt(i)) < val) {
//                charMap.put(s.charAt(i), i);
//                maxLength = Math.max(maxLength, i - val + 1);
//            } else {
//                val = charMap.get(s.charAt(i)) + 1;
//                charMap.put(s.charAt(i), i);
//            }
//        }
//
//        return maxLength;




                                         // USING -- SET  --->   SET<> VAR = NEW HASHSET<>();

        int left =0;
        int right = 0 ;
        Set<Character> set =  new HashSet<>();
        int maximum = 0;

        while(right < s.length()){
            char ch = s.charAt(right);
            if(set.add(ch)){
                maximum = Math.max(maximum , right-left + 1);
                right++;
            }
            else {
                while (s.charAt(left) != ch){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(ch);
                left++;
            }
        }
        return maximum;   //to return the maximum value just change the return type int

//        return set; // to return the chracters just change the return type Set<Character>
    }

    public static void main(String[] args) {
        String value = "osama";
        System.out.println(lengthOfLongestSubstring(value));
    }

}
