package my_pro;
import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args) {

        //using switch statement you can jump to any case based on your expression

        //syntax
//        switch (expression) {
            //case
//            case one:
            //Don something
//                break;
//            case two:
            //do something
//                  break;


//            default:
            //do something
//        }

        Scanner input = new Scanner(System.in);
        System.out.print("enter number =");
        String fruit = input.next();
        switch (fruit){
            case "1" :
                System.out.println("okkkk");
                break;
            case "2" :
                System.out.println("alright");
                break;

            default:
                System.out.println("default");
        }



    }
}
