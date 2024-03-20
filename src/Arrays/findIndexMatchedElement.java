package Arrays;

import java.util.ArrayList;

public class findIndexMatchedElement {

    static ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i= 0 ; i<n; i++){
            if(i+1 == arr[i]){
                ans.add(arr[i]);
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {15,2,45,12,7};
        int n = 5;
        System.out.println(valueEqualToIndex(arr ,n));
    }
}
