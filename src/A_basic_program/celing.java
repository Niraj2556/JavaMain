package Binary_search;

public class celing  {
    public static void main(String[] args) {
        int[] element = {23,776,877,888,2343,5432,7665,8977,99876};
        int target = 888;
        int answer = binary_search(element , target);
        System.out.println(answer);

    }
    static int binary_search(int[] hello , int target){
        int start = 0;
        int end = hello.length;

        //find the array is in ascending order or descending order
//        boolean agar = hello[start] < hello[end];

        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < hello[mid]) {
                end = mid - 1;
            } else if (target > hello[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }

        }

        return -1;
    }
}
