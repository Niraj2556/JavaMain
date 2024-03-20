package A_basic_program;

public class jump_game {
    public static boolean canJump(int[] nums) {
        int maxReach = 0; // Initialize the maximum reachable position
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // If we've reached a position where we can't proceed further
            if (i > maxReach) {
                return false;
            }

            // Update the maximum reachable position
            maxReach = Math.max(maxReach, i + nums[i]);

            // If the maximum reachable position is beyond or at the last index, return true
            if (maxReach >= n - 1) {
                return true;
            }
        }

        return false; // If we can't reach the last index
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
//        int[] nums2 = {3, 2, 1, 0, 4};

        System.out.println("Example 1: " + canJump(nums1)); // Output: true
//        System.out.println("Example 2: " + canJump(nums2)); // Output: false
    }
}
