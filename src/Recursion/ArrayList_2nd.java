package Recursion;
//Not the best approach to do
import java.util.ArrayList;

public class ArrayList_2nd {
    public static void main(String[] args) {

        int[] arr = {3,3234,332,334,32,332,45};
        int target = 332;
        System.out.println(fun(arr , target, 0));
    }


    public static ArrayList<Integer> fun(int[] arr , int target ,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> hello = fun(arr , target ,index +1);

        list.addAll(hello);
        return list;
    }
}
