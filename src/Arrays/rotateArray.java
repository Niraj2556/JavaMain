package Arrays;

import java.util.Arrays;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
public class rotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int i =0;
        int p = n - k + 1;

        for (int j = p; j < n; j++) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        int k = 4;
        rotate(nums, k);

    }
}
