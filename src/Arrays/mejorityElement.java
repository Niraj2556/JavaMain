package Arrays;

import java.util.*;
//import java.util.Arrays;
//import java.util.List;

public class mejorityElement {
    public static List<Integer> majorityElementQues(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int val : nums){
            if (!map.containsKey(val)){
                map.put(val ,1);
            }else{
                map.put(val, map.get(val) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if(entry.getValue() > nums.length/3)
            {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,4,4};
        System.out.println(majorityElementQues(arr));
    }
}
