package Arrays;

import java.util.Arrays;

public class missingNumber {
    static int missingNumbers(int array[], int n) {
        Arrays.sort(array);
        int ans = 0;
        for(int i = 1; i<=n ; i++){
            if(array[i-1] != i){
                ans = i;
                return ans;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2};
        int n = 1;

        System.out.println(missingNumbers(arr,n));
    }
}
