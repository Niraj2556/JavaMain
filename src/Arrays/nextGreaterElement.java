package Arrays;

import java.util.HashMap;
import java.util.Map;

public class nextGreaterElement {
    public static void main(String[] args) {


            int[] arr = {1,2,3,4,1,3,4,5,2,1,2,1,6};
            Map<Integer ,Integer> list = new HashMap<>();
            for (int val : arr){
                if (!list.containsKey(val)){
                    list.put(val ,1);
                }else{
                    list.put(val, list.get(val) + 1);
                }
            }

            System.out.println(list.entrySet());

            int maxFre = 0 , keystore = -1;

            //First Method

//        for (var ele : list.entrySet()){
//            if (ele.getValue() > maxFre){
//                maxFre = ele.getValue();
//                keystore = ele.getKey();
//            }
//        }
//
//        System.out.println();
//        System.out.println("Max frequency element");
//        System.out.printf("Max freq key is %d & value is %d", keystore,maxFre);


            //Another method is
            for(var key : list.keySet()){
                if (list.get(key) > maxFre){
                    maxFre = list.get(key);
                    keystore = key;
                }
            }
            System.out.printf("Max freq key is %d & value is %d", keystore,maxFre);


    }
}
