package HashMap;

import java.util.*;

public class countWord {
    public static int countWords(String[] words1, String[] words2) {
        HashMap<String , Integer> num1 = new HashMap<>();
        HashMap<String , Integer> num2 = new HashMap<>();

        int ans = 0;


        for (int i = 0; i < words1.length; i++) {
            if(num1.containsKey(words1[i])){
                num1.put(words1[i], i + 1 );
            }
            else{
                num1.put(words1[i], 1);
            }
        }

        for (int i = 0; i < words2.length; i++) {
            if(num2.containsKey(words2[i])){
                num2.put(words2[i], i +1);
            }
            else {
                num2.put(words2[i], 1);
            }
        }

        for(String s : num1.keySet()) {
            if(num2.containsKey(s) && num2.get(s) == 1 && num1.get(s) == 1) {
                ans++;
            }
        }
        return ans;

    }


    public static int countWfdords(String[] words1, String[] words2) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        int numOfWords = 0;

        for(int i=0;i<words1.length;i++) {
            if(hm1.containsKey(words1[i])) {
                hm1.put(words1[i],hm1.get(words1[i])+1);
            } else {
                hm1.put(words1[i],1);
            }
        }

        for(int i=0;i<words2.length;i++) {
            if(hm2.containsKey(words2[i])) {
                hm2.put(words2[i],hm2.get(words2[i])+1);
            } else {
                hm2.put(words2[i],1);
            }
        }

        for(String s : hm1.keySet()) {
            if(hm2.containsKey(s) && hm2.get(s) == 1 && hm1.get(s) == 1) {
                numOfWords++;
            }
        }

        return numOfWords;
    }






    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};

        System.out.println(countWords(words1  ,words2));
    }
}
