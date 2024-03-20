package Arrays;

public class maxDiff {
    public static int maximumGap(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i= 1;i<nums.length ; i++){
            int val = nums[i] - nums[i-1];
            int positiveVal = Math.abs(val);
            if(positiveVal > max){
                max = Math.max(max , positiveVal);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num ={100,3,2,1};
        System.out.println(maximumGap(num));
    }
}
