package Arrays;

public class maxWater {

    public static int maxArea(int[] height) {
        int waterStore = 0, left = 0 , right = height.length -1;

        while (left < right){
            waterStore = Math.max(waterStore, Math.min(height[left], height[right]) * (right -left));

            if(height[left] > height[right]) right--;
            else left++ ;
//            if (height[left] > height[right]) {
//                right--;  // Decrement right pointer
//            } else {
//                left++;  // Increment left pointer
//            }
        }
        return waterStore;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));
    }
}
