package Arrays;

import java.util.Arrays;

public class moveZeros {
    public static void moveZeroes(int[] nums) {

        int len  = nums.length;
        int[] ans = new int[len];
        int count = 0;
        for(int i= 0 ; i< len ; i++){
            if(nums[i] != 0){
                ans[count] = nums[i];
                count++;
            }
        }
        System.out.print(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);
    }
}
