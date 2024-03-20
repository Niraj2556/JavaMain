package Arrays;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Input: nums = [2,2,3,1]
//        Output: 1
//        Explanation:
//        The first distinct maximum is 3.
//        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
//        The third distinct maximum is 1.
public class thirdMax {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();




        for(int i=nums.length-1;i>=0;i--){
            set.add(nums[i]);
            if(set.size()==3) return nums[i];

        }
        return nums[nums.length-1];
    }







//    public static int thirdMax(int[] nums) {
//        int count  = 0;
//        if(nums.length < 3){
//            return nums[nums.length-1];
//        }
//
//        else{
//            int i = 1;
//            while (i<nums.length){
//                if(count == 2){
//                    return nums[count];
//                }
//                if(nums[i-1] != nums[i]){
//                    count++;
//                    i++;
//
//                }else{
//                    i++;
//                }
//            }
//        }
//        return nums[count];
//    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
}
