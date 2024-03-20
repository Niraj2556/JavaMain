package my_pro;
import java.util.Scanner;
public class advanced_switch_statement {
    public static void main(String[] args) {
//        advanced_switch_statement

        //It is easy to implement the switch cases with less codes
//        like
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Please:");
        String fruit = input.next();
        switch (fruit){
            case "1"-> System.out.println("Small size");
            case "2"-> System.out.println("large size");
            default -> System.out.println("Defult");
        }


    }
}
