package pattern_printing;

import java.util.Scanner;

public class newPattern {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number : ");
//        int n = scanner.nextInt();

        int n= 3;
        // Part 1: Print "@" n times
        for (int i = 1; i <= n; i++) {
            System.out.println("@");
        }

        int space = Integer.MIN_VALUE;

        // Part 2
        for (int i = 0; i < n; i++) {

            // For spacing
            if (i > 0) {
                int a = n * i - (i - 1);
                space = Math.max(space, a);
                int j = 1;
                while (j <= a) {
                    System.out.print("-");
                    j++;
                }
            }

            // For printing "*" separated with space
            for (int k = 1; k <= n; k++) {
                if (i == 0 && k == 1) System.out.print("@");
                System.out.print("*");
                if (i == n - 1 && k == n) System.out.print("@");
            }

            System.out.println();
        }

        // Part 3: Print spaces and "@"
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space + n; j++) {
                System.out.print("-");
            }
            System.out.println("@");
        }

    }
}
