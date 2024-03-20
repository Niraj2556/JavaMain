package Recursion;

public class CallingManyFunction {
    public static void main(String[] args) {
        p1(1);
    }
    static void p1(int n){
        if (n == 5) {
            return;
        }
        System.out.println(n);
        p1(n+1);
    };
//    static void p2(int n){
//        System.out.println(n);
//        p3(3);
//    };
//    static void p3(int n){
//        System.out.println(n);
//        p4(4);
//    };
//    static void p4(int n){
//        System.out.println(n);
//    }

}
