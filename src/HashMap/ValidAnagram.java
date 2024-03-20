package HashMap;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> Smap = new HashMap<>();
        Map<Character, Integer> Tmap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Smap.containsKey(ch)){
                Smap.put(ch,Smap.get(ch)+1);
            }else {
                Smap.put(ch,1);
            }

        }

        for(int i=0;i<s.length();i++){
            char ch = t.charAt(i);
            if(Tmap.containsKey(ch)){
                Tmap.put(ch,Tmap.get(ch)+1);
            }else {
                Tmap.put(ch,1);
            }

        }
        for(char k: Smap.keySet()){
            if(!Smap.get(k).equals(Tmap.get(k))) return false;
        }
        return true;

//        for(int i =0; i<s.length() ; i++){
//            char ch = s.charAt(i);
//            map.put(ch , 1);
//        }
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            if(!map.containsKey(ch)){
//                return false;
//            }else {
//                map.remove(ch);
//            }
//
//        }
//        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "aanagrm";
        System.out.println(isAnagram(s,t));
    }
}
