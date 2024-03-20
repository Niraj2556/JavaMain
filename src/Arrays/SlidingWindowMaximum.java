package Arrays;

    import java.util.*;

    public class SlidingWindowMaximum {

        public static int[] slidingWindowMax(int[] nums, int k) {

//           //BruteForce Approach
//            if (nums == null || nums.length == 0 || k <= 0)
//                return new int[0];
//
//            int n = nums.length;
//            int[] result = new int[n - k + 1];
//
//            for (int i = 0; i <= n - k; i++) {
//                int max = nums[i];
//                for (int j = i + 1; j < i + k; j++) {
//                    max = Math.max(max, nums[j]);
//                }
//                result[i] = max;
//            }
//
//            return result;




            //Using Deque
//            if (nums == null || nums.length == 0 || k <= 0)
//                return new int[0];
//
//            int n = nums.length;
//            int[] result = new int[n - k + 1];
//            int resultIndex = 0;
//
//            Deque<Integer> deque = new ArrayDeque<>(); // To store indices of elements in the current window
//
//            for (int i = 0; i < n; i++) {
//                // Remove indices that are out of the current window
//                while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
//                    deque.pollFirst();
//                }
//
//                // Remove indices of smaller elements as they won't be useful anymore
//                while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
//                    deque.pollLast();
//                }
//
//                deque.offerLast(i); // Add the current index to the deque
//
//                // Add the maximum element in the current window to the result array
//                if (i >= k - 1) {
//                    result[resultIndex++] = nums[deque.peekFirst()];
//                }
//            }
//
//            return result;



            //Priority Queue
            int n = nums.length;

            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

            ArrayList<Integer> ans = new ArrayList<>();


            int[] arr = new int[n-k+1];


            int i = 0;

            for( ; i<k ; i++){
                queue.add(nums[i]);
            }

            ans.add(queue.peek());

            queue.remove(nums[0]);


            for( ; i<n; i++) {
                queue.add(nums[i]);


                ans.add(queue.peek());

                queue.remove(nums[i - k + 1]);

            }

            for (int j = 0; j < ans.size(); j++)
                arr[j] = ans.get(j);

            return arr;
        }





        public static void main(String[] args) {
            int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;

            int[] result = slidingWindowMax(nums, k);
            System.out.println(Arrays.toString(result)); // Output: [3, 3, 5, 5, 6, 7]
        }
    }
