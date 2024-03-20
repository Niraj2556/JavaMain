package Arrays;

public class removeValElement {


    static int removeVal(int[] nums, int val){
        int count =0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if(val != nums[i]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;


    }


    public static void main(String[] args) {
        int[] arr = {3,2,2,3};

        int val = 2;
        System.out.println(removeVal(arr, val));
    }
}
