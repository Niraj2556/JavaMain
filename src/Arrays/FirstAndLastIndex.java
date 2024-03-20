package Arrays;

import java.util.Arrays;

public class FirstAndLastIndex {

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,9,12,19};
        int tar = 7;
//        searchRange();
        System.out.println(Arrays.toString(searchRange(arr,tar)));
    }
        public static int[] searchRange(int[] arr, int target) {
            int[] result = new int[2];
            result[0] = first(arr, target);
            result[1] = last(arr, target);
            return result;
        }

        private static int first(int[] nums, int target) {
            int start = 0, end = nums.length - 1;
            int result = -1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    result = mid;
                    end = mid - 1; // Move start to find earlier occurrences
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            return result;
        }

        private static int last(int[] nums, int target) {
            int start = 0, end = nums.length - 1;
            int result = -1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    result = mid;
                    start = mid + 1; // Move end to find later occurrences
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            return result;
        }
    }

