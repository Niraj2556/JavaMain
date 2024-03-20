package String;

import java.util.HashMap;
import java.util.Map;

public class minimizeString {
    public static String minimizedStringLength(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch ,i+1);
            }
            else {
                map.remove(ch);
            }
        }


        return map.keySet().toString();



    }






//    public static int minimizedStringLength(String s) {
//        StringBuilder ans = new StringBuilder();
//
//        int i = 1;
//        while(i < s.length()){
//            char pre = s.charAt(i -1);
//            char curr = s.charAt(i);
//
//            if(pre == curr){
//                i++;
//            }
//            else{
//                ans.append(pre);
//                i++;
//            }
//        }
//
//        int ret = ans.length() + 1;
//
//        return ret;
//    }

    public static void main(String[] args) {
        String s = "ipi";
        System.out.println(minimizedStringLength(s));
    }

}
