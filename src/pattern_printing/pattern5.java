package pattern_printing;

import java.util.Scanner;

//Print this
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Read the next integer from the screen
        System.out.println("enteer:");
        int num = s.nextInt();

        print(num);
    }
    static void print(int n){
        n = n-1;
        for (int i = 0; i <= 2 * n; i++) {
            int total = i > n ? 2 * n - i : i;
            for (int j = 0; j <= total; j++) {
                System.out.print("* ");

            }
            System.out.println();
            System.out.println();

        }
    }
}
