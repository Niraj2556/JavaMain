package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> newMap = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;

    }
    public static int RtoI(String s){
         Map<Character, Integer> map=new HashMap<Character, Integer>();
         //adding elements to the Map
         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
         s = s.replace("IV","IIII");
         s = s.replace("IX","VIIII");
         s = s.replace("XL","XXXX");
         s = s.replace("XC","LXXXX");
         s = s.replace("CD","CCCC");
         s = s.replace("CM","DCCCC");
         int number = 0;

         for (int i = 0; i < s.length(); i++)
         {

             number = number + (map.get(s.charAt(i)));
         }
         return number;

    }
    public static void main(String[] args) {
        String ans = "III";
        String res = "MCMXCIV";
        System.out.println("Optimal  "+romanToInt(ans));
        System.out.println("BruteForce  "+RtoI(res));
    }
}
