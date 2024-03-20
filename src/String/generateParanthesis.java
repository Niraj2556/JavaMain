package String;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class generateParanthesis {
    public static List<String> generateParen(int n) {
        List<String>ans=new ArrayList<>();
        backtrack("",0,0,ans,n);
        return ans;

    }
    public static void backtrack(String s, int openN, int closeN, List<String> ans, int n){
        if(openN==n && closeN==n){
            ans.add(s);
        }
        if(openN<n){//allowed to put close
            backtrack(s+"(",openN+1,closeN,ans,n);
        }
        if(closeN<openN){
            backtrack(s+")",openN,closeN+1,ans,n);
        }
    }


    public static void main(String[] args) {
        System.out.println(generateParen(3));

    }
}
