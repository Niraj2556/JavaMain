package Recursion;

public class BinarySearch_Recursion {
    public static void main(String[] args) {
        int[] hello ={2,4,56,76,88,98,100,102};
        int target = 56;
        int ans = BS(hello ,target , 0 , hello.length-1 );
        System.out.println(ans);
    }
    static int BS(int[] array ,int target , int start,int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (array[mid] == target) {
            return mid;
        }
        if (array[mid] > target) {
            return BS(array, target, start, mid - 1);
        }
        else {
            return BS(array, target, mid + 1, end);
        }
    }
}
