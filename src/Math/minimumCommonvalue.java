package Math;

//Input: nums1 = [1,2,3], nums2 = [2,4]
//Output: 2
//Explanation: The smallest element common to both arrays is 2, so we return 2


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class minimumCommonvalue {

    public static int getCommon(int[] nums1, int[] nums2) {

//        Set<Integer> set = new HashSet<>();
//
//        for(int i= 0 ; i<nums1.length ; i++){
//            set.add(nums1[i]);
//        }
//
//        for(int i= 0; i<nums2.length ; i++){
//            if(set.contains(nums2[i])) return nums2[i];
//        }
//        return -1;






//        int in1 = 0, in2 = 0;
//        int n1 = nums1.length, n2 = nums2.length;
//
//        while(in1 < n1 && in2 < n2){
//            if(nums1[in1] == nums2[in2]){
//                return nums1[in1];
//            }else if(nums1[in1] > nums2[in2]){
//                in2++;
//            }else{
//                in1++;
//            }
//        }
//
//        return -1;





        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return -1; // No common integer found


//        int num = -1;
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//
//                if(nums1[i] == nums2[j]) {
//                    num = nums1[i];
//                    break;
//                }
//                break;
//            }
//        }
//        return num;

    }

    public static void main(String[] args) {
       int[] nums1 = {1,2,3,6};
       int[] nums2 = {2,3,4,5};
//        nums1 = [], nums2 = []

        System.out.println(getCommon(nums1 , nums2));
    }
}
