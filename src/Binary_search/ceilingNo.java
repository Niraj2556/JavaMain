package Binary_search;

public class ceilingNo {
    public static void main(String[] args) {

        int[] array = {43,67,324,433,567,789,843,988,1000};

        int target = 553;

        int ans = binary_search(array ,target);
        System.out.println(ans);
    }

    static int binary_search(int[] array , int target){
        int start = 0;
        int end = array.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < array[mid]){
                end = mid -1;
            } else if (target > array[mid]) {
                start = mid+1;

            }
            else {
                return mid;
            }
        }
        return start;
    }


}