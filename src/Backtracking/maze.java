package Backtracking;

public class maze {
    public static void main(String[] args) {

        System.out.println(count(3,3));
        System.out.println(count_Diagonal(3,3));
    }
    static int count(int row , int cols){
        if(row == 1 || cols == 1){
            return 1;
        }
        int left = count(row -1, cols);
        int right = count(row ,cols -1);

        int ans = left + right;
        return ans;
    }


    static int count_Diagonal(int r , int c){
//        int d ;
        if (r == 1 || c == 1){
            return 1;
        }
        int left = count_Diagonal(r-1 , c);
        int diagonal = count_Diagonal(r -1, c -1);
        int right = count_Diagonal(r ,c-1);

        int ans  = left + right +diagonal;
        return ans;
    }
}
