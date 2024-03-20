package Binary_search;

public class infinite {
    public static void main(String[] args) {
       int[] array = {3,5,65,66, 78 ,90, 99, 110};
       int target = 78;
        System.out.println(ans(array ,target));
   }
    static int ans(int[] array , int target){
        int start = 0;
        int end = 1;

        while(array[end] < target){
            int newStart = end + 1;

            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return binary_search(array , target , start , end);
    }


    static int binary_search(int[] array , int target , int start , int end){

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
        return -1;
    }
}
