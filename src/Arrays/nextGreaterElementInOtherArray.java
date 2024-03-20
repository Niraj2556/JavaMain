package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementInOtherArray {
    public static int[] find(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[10001];
        Arrays.fill(nextGreater, -1);

        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreater[stack.pop()] = num;
            }
            stack.push(num);
        }

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater[nums1[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(find(nums1 , nums2)));
    }

}
