package Recursion;

public class sorted_or_not {
    public static void main(String[] args) {

        int[] hello = {3,6,76,876,9098,9887};
        int index =0;
        System.out.println(sort(hello , index));
    }
    static boolean sort(int[] arr ,int index){

        if (index == arr.length -1 ){
            return true;
        }
        int current = arr[index];
        int next = arr[index + 1];


        return current < next && sort(arr , index +1);
    }
}
