package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int ans = fib(10);
        System.out.println(ans);
    }

    static int fib(int n){
        int add =0;
        if(n==0 || n==1){
            return n;

        }
        else {
//            return (n-1 + n-2);
            int left = fib(n-1);
            int right = fib(n-2);
            add = left + right;
        }
        return add;
    }
}
