package Math;
import java.util.*;
//Input: arr = [4,2,1,3]
//Output: [[1,2],[2,3],[3,4]]

public class minimumAbsoluteDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            int minAbsDiff = Integer.MAX_VALUE;
            List<List<Integer>> result = new ArrayList<>();

            for (int i = 1; i < arr.length; i++) {
                int diff = arr[i] - arr[i - 1];
                if (diff < minAbsDiff) {
                    minAbsDiff = diff;
                    result.clear();
                    result.add(Arrays.asList(arr[i - 1], arr[i]));
                } else if (diff == minAbsDiff) {
                    result.add(Arrays.asList(arr[i - 1], arr[i]));
                }
            }

            return result;
        }


//    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
//        Arrays.sort(arr);
//        List<List<Integer>> result = new ArrayList<>();
//        int max = 1;
//        for(int i = 0 ; i< arr.length ; i++){
//            for(int j = 1; j< arr.length ; j++){
//                int val = arr[j] - arr[j - 1];
//                max = Math.min(max,val);
//            }
//        }
////        Input: arr = [1,3,6,10,15]
////        Output: [[1,3]]
//        for (int i = 0; i < arr.length -1; i++) {
//            int newVal = arr[i] + max;
//            List<Integer> ans = new ArrayList<>();
//            ans.add(arr[i]);
//            ans.add(newVal);
//            result.add(ans);
//        }
//        return result;
//    }

        public static void main(String[] args) {
            int[] n = {1,3,6,10,15};
//        System.out.println(minimumAbsDifference(n));

            System.out.println(minimumAbsDifference(n));

        }
    }