package function;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("here we done some practice with the function");
        String home = hello();
        System.out.println(home);
//        hello();
//        hello();
//        hello();
//        hello();
//        String s1 = new String("example");
//        System.out.println(s1);


    }
    static String hello(){
        String a =("My name is ");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name Here : ");
        String b = input.next();

        String name = a + b;
        return name;



    }
}
