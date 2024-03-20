package Recursion;

public class linear_search {
    public static void main(String[] args) {

        int[] arr ={33,23,23,543,12,343,223,32,43};
        int target = 12;
        System.out.println(linear(arr ,target , 0));
    }
    static int linear(int[] arr ,int target, int index){
        if(index == arr.length){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }else {
            return linear( arr, target, index +1);

        }
    }
}
