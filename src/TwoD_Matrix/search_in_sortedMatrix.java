package TwoD_Matrix;

import java.util.Arrays;

public class search_in_sortedMatrix {
    static int[] retPosition(int[][] mat , int target){
        int r = 0;
        int c = mat.length - 1;

        while(r < mat.length && c >= 0){
            if(mat[r][c] == target){
                return new int[]{r +1 , c +1};
            }
            if(mat[r][c] < target) r++;
            else c--;
        }
        return new int[]{-1 ,-1};
    }

    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,27,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(retPosition(mat , 38)));
    }
}
