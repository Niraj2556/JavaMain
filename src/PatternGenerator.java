import java.util.Scanner;
public class PatternGenerator {

//    public static void main(String[] args)
//
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the value of n: ");
//        int n = scanner.nextInt();
//
//        printPattern(n);
//    }
//
//    public static void printPattern(int n) {
//        // Top section
//        for (int i = 1; i <= n; i++) {
//            System.out.println("@");
//        }
//
//        // Middle section
//        for (int i = 0; i < 3; i++) {
//            if (i == 0) {
//                System.out.println("@***");
//            } else {
//                System.out.printf("%" + (n + 1 - i) + "s***\n", ""); // Right-align stars
//            }
//        }
//
//        // Bottom section
//        for (int i = 1; i <= n + 1; i++) {
//            System.out.println("@");
//        }
//    }










    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for n (n >= 2): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Invalid input. n must be greater than or equal to 2.");
            return;
        }

        // Print the top part of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        // Print the middle part of the pattern
        for (int i = 1; i <= n - 1; i++) {
            System.out.print("  ");
        }
        System.out.println("a**");

        // Print the bottom part of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

}
