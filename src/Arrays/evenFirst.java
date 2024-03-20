package Arrays;

import java.util.Arrays;

public class evenFirst {
    public static int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            while(i<j&&nums[i]%2==0) i++;
            while(i<j&&nums[j]%2!=0) j--;
            if(i<j){
                int tempo=nums[i];
                nums[i]=nums[j];
                nums[j]=tempo;
            }else{
                return nums;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ans = {2,5,4,3,1 ,0};
        System.out.println(Arrays.toString(sortArrayByParity(ans)));

    }
}
