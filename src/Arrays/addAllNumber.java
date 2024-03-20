package Arrays;

public class addAllNumber {
    public static long getSum(long a[], long n)
    {
        long ans =0;

        int i =0;

        while(i<n){
            ans += a[i];
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        long[] arr = {3,4,2};
        long n = 3;

        System.out.println(getSum(arr, n));
    }
}
