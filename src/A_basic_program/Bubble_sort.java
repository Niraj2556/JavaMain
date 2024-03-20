package Sort;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
//        int[] array ={1,2,3,4,5};
//        bubble_sort(array);
//        System.out.println(Arrays.toString(array));
        int [] array1 = {5,4,3,2,1};
        bubble_sort(array1);
        System.out.println(Arrays.toString(array1));
    }
    static void bubble_sort(int[] hello){

        //what if the array is already in the sorted form that's why we use boolean to check
        boolean swapped;

        for (int i = 0; i < hello.length; i++) {
            {
                swapped = false;
                for (int j = 1; j < hello.length - i; j++) {
                    if (hello[j]<hello[j-1]){
                        //swap
                        int temp = hello[j];
                        hello[j] = hello[j-1];
                        hello[j-1] = temp;
                        swapped =true;
                    }
                }
            }

            if (!swapped){
                break;
            }
        }
    }
}
