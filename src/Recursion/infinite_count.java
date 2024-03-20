package Recursion;

public class infinite_count {
    public static void main(String[] args) {
        int count= 0;
        fun();
//        System.out.println(ans);
    }
    static int count = 0;
    static void fun(){
            System.out.println(count + "hello");
            count++;
            fun();
    }
}
