package pattern_game;

public class first {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(5);
//        pattern3(4);
        pattern4(4);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //O/p  n=4
//        *
//        * *
//        * * *
//        * * * *
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//o/p
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n + 1 - row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//o/p
//        * * * *
//        * * *
//        * *
//        *

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <=row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}