package pattern_printing;

//Print this

//        *
//        *  *
//        *  *  *
//        *  *  *  *
//        *  *  *  *  *
public class mirrorOfTriangle {
    public static void main(String[] args) {

        printpat(5);
    }

    public static void printpat(int row){
        //outer loop
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
