package ArrayList;

//import java.util.ArrayList;
import java.util.*;

public class findDuplicate {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList check = new ArrayList();

        for(int i= 0; i<n ; i++){
            if(check.contains(arr[i])){
                if(!ans.contains(arr[i])){
                    ans.add(arr[i]);
                }

            }else {
                check.add(arr[i]);
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
            return ans;
        }
        Collections.sort(ans);
        return ans;

    }

    public static void main(String[] args) {
        int[] ans = {3,4,12,3,12,3,4,4,12,7,11,6,5};
        int n =13;

        System.out.println(duplicates(ans, n));
    }
}
