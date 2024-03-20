package pattern_printing;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        printPattern(N);
    }

    public static void printPattern(int N) {
        for (int i = N; i >= 1; i--) {
            for (int j = N; j >= 1; j--) {
                for (int k = 0; k < i; k++) {
                    System.out.print(j + " ");
                }
                System.out.print("$ "); // Print "$" at the end of each row
            }
        }
    }
}
