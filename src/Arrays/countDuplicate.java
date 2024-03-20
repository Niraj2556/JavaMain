package Arrays;

public class countDuplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] as  = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(as));
    }
}
