package Arrays;

import java.util.Arrays;

public class singleNum {
    static int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++)
        {
            res ^= nums[i];
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] go ={4,1,2,1,2};
        singleNumber(go);
    }
}
