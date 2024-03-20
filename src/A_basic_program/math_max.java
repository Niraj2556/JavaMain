import java.util.Scanner;

public class math_max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = input.nextInt();
        System.out.println("Enter number 2");
        int b = input.nextInt();
        System.out.println("Enter number 3");
        int c = input.nextInt();

        int maximum = Math.max(a,Math.max(b,c));

        System.out.println("The maximum number is " + maximum);
    }
}
