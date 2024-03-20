package Binary_search;

import java.util.Arrays;

public class matrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 49;
        System.out.println(Arrays.toString(search(matrix, target)));
    };
    static int[] search(int[][] matrix, int target ){
        int row = 0;
        int cols = matrix.length-1;

        while (matrix.length > row && cols >= 0){
            if (matrix[row][cols] == target){
                return new int[] {row,cols};
            }
            if (target > matrix[row][cols]){
                row++;
            }
            if (target < matrix[row][cols]){
                cols--;
            }
        }
        return new int[]{-1,-1};
    }
}
