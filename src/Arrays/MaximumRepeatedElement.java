package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MaximumRepeatedElement {

    public static int majorityElement(int[] nums) {
        // Initialize variables to keep track of the majority element and its occurrence count.
        int count = 0;
        int majority = 0;

        // Loop through the array to find the majority element using Boyer-Moore Majority Vote Algorithm.
        for (int i = 0; i < nums.length; i++) {

            // If the count is 0 and the current majority candidate is not equal to the current element,
            // update the majority candidate to the current element and set count to 1.
            if (count == 0 && majority != nums[i]) {
                majority = nums[i];
                count = 1;
            } else if (majority == nums[i]) {
                // If the current element is equal to the majority candidate, increment the count.
                count++;
            } else {
                // If the current element is not equal to the majority candidate, decrement the count.
                count--;
            }
        }



        // The majority variable will contain the element that appears more than ⌊n/2⌋ times in the array.
        return majority;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,5,5,5,1,1,4,4,5,5};
        System.out.println(majorityElement(arr));

    }
}
