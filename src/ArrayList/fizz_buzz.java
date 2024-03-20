package ArrayList;

import java.util.*;

public class fizz_buzz {
    public fizz_buzz(int n) {
    }

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for(int i = 1; i <= n; i ++){
            if(i % 3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
            }else if(i % 3 == 0 && i % 5 != 0){
                ans.add("Fizz");
            }else if(i % 3 != 0 && i % 5 == 0){
                ans.add("Buzz");
            }else ans.add(String.valueOf(i));
        }
        return ans;

    }

    public static void main(String[] args) {
        int n = 6;

        System.out.println(fizzBuzz(n));
    }

}
