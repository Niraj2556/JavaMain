package pattern_printing;

public class hollowPattern {

//    Print this
//             *  *  *  *  *  *
//             *              *
//             *              *
//             *              *
//             *  *  *  *  *  *
    public static void main(String[] args) {

        hollowPatternPrint(5 , 6);
    }

    public static void hollowPatternPrint(int row , int col){
        //outer loop
        for (int i = 1; i <= row; i++) {
            //inner loop
            for (int j = 1; j <= col; j++) {
                //Condition for boundary
                if( i == 1 || i == row || j == 1 || j == col){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
}
