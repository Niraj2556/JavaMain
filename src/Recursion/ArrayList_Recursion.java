package Recursion;

import java.util.ArrayList;

public class ArrayList_Recursion {
    public static void main(String[] args) {

        int[] array = {12,22,54,66,76,87,3,3,445,43,43};
        int target = 43;
        System.out.println(find(array ,target ,0,new ArrayList<>()));

    }


    static ArrayList <Integer> find(int[] array , int target ,int index ,ArrayList<Integer> name){
        if (index == array.length) {
            return name;
        }
        if (array[index] == target) {
            name.add(index);
        }
        return find(array ,target, index+1 ,name);
    }
}
