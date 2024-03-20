package Arrays;

import java.util.Arrays;

public class averageOfAll {
    static float[] streamAvg(int[] arr, int n) {
        float[] ans = new float[n];

        int store = 0;
        for (int i = 0; i < n; i++) {
            store += arr[i];
            int let = i+1;
            ans[i]  = store / let;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        streamAvg(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
