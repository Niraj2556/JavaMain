package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class moveZeroes {
    public static void moveZero(int[] nums) {
        int j = nums.length-1;
        int i = 0;
       while (i < j ){
            if(nums[i] != 0)i++;
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j--;
                System.out.println(Arrays.toString(nums));
            }
        }

    }


    public static void main(String[] args) {
        int[] num = {0,1,0,3,12};

        moveZero(num);

        System.out.println(Arrays.toString(num));
    }
}
