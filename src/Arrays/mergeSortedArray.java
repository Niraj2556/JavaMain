package Arrays;

import java.util.Arrays;

public class mergeSortedArray {


//            src − This is the source array.
//            srcPos − This is the starting position in the source array.
//            dest − This is the destination array.
//            destPos − This is the starting position in the destination data.
//            length − This is the number of array elements to be copied.
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
