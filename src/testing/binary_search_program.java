package testing;

import java.util.Arrays;

public class binary_search_program {
    public static void main(String[] args) {

        int[] nums = {12,43,65,87,98,232,334,455,677};
//
//        int target = 98;
//
//        int ans = search(nums ,target);
//        System.out.println(ans);

        

    }

    static int search(int[] nums , int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid+1;

            }
            else {
                return mid;
            }
        }
        return -1;
    }


    public static class peak_in_mountain {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,9,6,5,4,3,2,1};

            System.out.println(peakIndexInMountainArray(arr));
        }

        static int peakIndexInMountainArray(int[] nums){
            int start = 0;
            int end = nums.length - 1;

            while(start < end){
                int mid = start + (end - start)/2;

                if (nums[mid] > nums[mid + 1]){

                    end = mid;
                }else {
                    start = mid +1;

                }
            }
            return start;
        }
    }

    public static class hello {
        public static void main(String[] args) {

            int[] array = {12,43,65,87,98,232,334,455,677};

            int target = 564;

            int ans = nextGreatestLetter(array ,target);
            System.out.println(ans);
        }

        static int nextGreatestLetter(int[] letters , int target){
            int start = 0;
            int end = letters.length - 1;

            while(start <= end){
                int mid = start + (end - start)/2;

                if(target < letters[mid]){
                    end = mid -1;
                } else{
                    start = mid+1;

                }

            }
            return letters[start % letters.length];
        }






    }
}