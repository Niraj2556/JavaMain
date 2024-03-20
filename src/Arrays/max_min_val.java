package Arrays;

public class max_min_val {
    public static void ans(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i]){
                max = Math.max(max , arr[i]);
            }else {
                max = Math.max(max , arr[i-1]);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]){
                min = Math.min(min , arr[i]);
            }else {
                min = Math.min(min , arr[i-1]);
            }
        }
        System.out.println("minimun : " + min +"  maximum :" + max);
    }

    public static void main(String[] args) {
        int[] arr = {5,545,45,44,54,53};
        ans(arr);
    }
}
