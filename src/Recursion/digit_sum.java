package Recursion;

public class digit_sum {
    public static void main(String[] args) {
        int ans = digit_sum(1342);
        System.out.println(ans);
    }
    static int digit_sum(int n){
//        int mod = n%10;
//        int div = n/10;
        if(n==0){
            return 0;
        };

        return (n%10) + digit_sum(n/10);
    }
}
