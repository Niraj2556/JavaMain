package Arrays;

import java.util.Arrays;

public class rotate_image {
//    public static void rotate(int[][] matrix) {
//        int n = matrix.length;
//
//        //Column Reverse
//        for(int i = 0; i < n; i++){
//            int a = 0;
//            int b = n-1;
//            while(a <= b){
//                int temp = matrix[a][i];
//                matrix[a][i] = matrix[b][i];
//                matrix[b][i] = temp;
//                a++;
//                b--;
//            }
//
//        }
//
//        //Transpose
//        for(int i = 0; i < n; i++){
//            for(int j =i+1; j< n; j++){
//                int temp =  matrix[i][j];
//                matrix[i][j] =  matrix[j][i];;
//                matrix[j][i] = temp;
//            }
//        }
//
//    }




//    Other
    public static void rotate(int[][] matrix) {

        //Column in row respectively
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }


        //Rotate every rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length /2 ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {
//        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//        Output: [[7,4,1],[8,5,2],[9,6,3]]

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
