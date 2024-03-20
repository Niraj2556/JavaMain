package Arrays;

public class sort_Zero_One_Two {
    public static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0) zero++;
            if(nums[i] == 1) one++;
            if(nums[i] == 2) two++;
        }
        for(int i=0; i < zero ; i++) nums[i] =0;
        for(int i=zero; i < one + zero ; i++) nums[i] = 1;
        for(int i=one + zero; i < nums.length ; i++) nums[i] = 2;

    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {

            System.out.print( nums[i] + " ");
        }
        System.out.println("]");
    }
}
