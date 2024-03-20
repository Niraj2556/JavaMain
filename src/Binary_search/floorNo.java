package Binary_search;

public class floorNo{
    public static void main(String[] args) {

        int[] array = {12,43,65,87,98,232,334,455,677};

        int target = 564;

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
        return end;
    }


}