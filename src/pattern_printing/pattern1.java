package pattern_printing;


//Print this
//        * * * * * * * *
//        * * * * * * * *
//        * * * * * * * *
//        * * * * * * * *
//        * * * * * * * *
//        * * * * * * * *
//        * * * * * * * *
//        * * * * * * * *
public class pattern1 {
    public static void main(String[] args) {

        int number  = 9;

        print(number);
    }

    static void print(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
