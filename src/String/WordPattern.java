package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] arr =  s.split(" ");
        if(arr.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            char c = pattern.charAt(i);
            String str = arr[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(str))
                    return false;
            }
            else{
                if(map.containsValue(str)) return false;
                map.put(c, str);
            }
        }
        return true;

    }



//    public static boolean wordPatternn(String pattern, String s) {
//        String[] array = s.split(" ");
//        if(array.length != pattern.length()) return false;
//
//        Map<Character, String> char_string = new HashMap<>();
//        Map<String, Character> string_char = new HashMap<String, Character>();
//
//        for(int i=0; i<pattern.length(); i++){
//            char c = pattern.charAt(i);
//            String str = array[i];
//            if(!char_string.containsKey(c)){
//                char_string.put(c,str);
//            }
//            if(!string_char.containsKey(str)){
//                string_char.put(str,c);
//            }
//            if(!char_string.get(c).equals(str) || !string_char.get(str).equals(c)){
//                return false;
//            }
//        }
//        return true;
//    }


    public static void main(String[] args) {
        String pat = "abba" , str = "dog cat cat dog";

        System.out.println(wordPattern(pat , str));
    }
}
