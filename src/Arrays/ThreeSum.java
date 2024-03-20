package Arrays;

import java.util.*;

public class ThreeSum {
    public static Set<Integer> three_sum(int[] nums){
        Set<Integer> ans = new HashSet<Integer>();

        int len = nums.length -1 ;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1 ; j < len; j++) {
                for (int k = j+1; k < len; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0){
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        System.out.println(ans);
                        return ans;
                    }
                }
            }

        }
        return null;
    }



    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high){
                    if(nums[low] + nums[high] == sum){

                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low+1]) low++;
                        while (low < high && nums[high] == nums[high-1]) high--;

                        low++;
                        high--;
                    }
                    else if (nums[low] + nums[high] < sum) low++;
                    else high--;
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
//        [0,1,1] , [0,0,0]
        System.out.println(threeSum(arr));
    }
}
