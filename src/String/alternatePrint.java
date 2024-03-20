package String;

public class alternatePrint {
    static String delAlternate(String S) {
        String ans = "";
        int len  = S.length();
        int i = 0 ;
        while(i < len){
            char ch = S.charAt(i);
            ans += String.valueOf(ch);
            i += 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        String vh = "HelloIamNeeraj";

        System.out.println(delAlternate(vh));
    }
}
