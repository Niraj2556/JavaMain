package sorting;

import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        cyclic(array);
        System.out.println(Arrays.toString(array));
    };
    static void cyclic(int[] array){
        int i = 0;

        while (i < array.length){
            int correct = array[i] - 1;

            if (array[i] != array[correct]){
                swap(array , i , correct);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr ,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
