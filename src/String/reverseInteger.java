package String;

import java.util.Arrays;

public class reverseInteger {
    public static boolean isNumber(String s) {
        int len = s.length();
        for(int i= 0; i<len; i++){
            char cha = s.charAt(i);
            if(cha == '.');
            try{
                String bb = String.valueOf(cha);
                System.out.println(bb);
                int val = Integer.parseInt(bb);
            }catch(Exception e){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s = ".1";
        System.out.println(isNumber(s));
    }
}
