package function;

import java.util.Scanner;

public class function_intro {
    public static void main(String[] args) {
        hello(43,43);
    }
    static void hello( int num1 ,int num2){
        System.out.println("Here we use simple function use for addition");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
//        int num1= input.nextInt();
        System.out.print("Enter the second number: ");
//        int num2= input.nextInt();

        int sum = num1+num2;

        System.out.println("Sum of "+num1 +" and "+num2+" is "+ sum);


    }

}
