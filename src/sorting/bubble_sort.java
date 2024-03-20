package sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {

        int[] nums = {2,77,9,23,88,11,3,78,97};

        sortArray(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void sortArray(int[] nums){
        int len = nums.length;
        for(int i=0 ; i<len ;i++){
            for (int j = 1; j < len - i;j++) {
                if (nums[j-1] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums [j-1] = temp;
                }
            }
        }
    }
}
