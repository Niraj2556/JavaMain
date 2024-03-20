package HashMap;

import java.util.HashMap;
import java.util.Map;

public class basic {
    public static void hashMap(){
        Map<String , Integer> list = new HashMap<>();


        //Add Element
        list.put("neeraj" , 63);
        list.put("nraj" , 33); //deleted
        list.put("neeaj" , 83);
        list.put("neer" , 23);
        list.put("nj" , 13);




        //get the access of value using keys
        System.out.println(list.get("neeraj"));
        System.out.println(list.get("nraj"));




//        Update the values
        list.put("nraj" ,343);
        System.out.println(list.get("nraj"));




//        to remove or delete any key
        list.remove("nraj");
        System.out.println(list.get("nraj"));




        //Find whether the element is present or not with using "Key"
        //It return the value
        System.out.println(list.containsKey("nraj"));




        //To get all the "Keys" or Print all the "keys" using ----->>> "keySet()"
        System.out.println(list.keySet());
        //Output
//        [neer, neeaj, nj, neeraj]




        //To get all the "values" or Print all the "values" using ----->>> "values()"
        System.out.println(list.values());
        //Output
//        [23, 83, 13, 63]





        //To print all the "keys" & "values" using "entrySet()"
        System.out.println(list.entrySet());
        //Output
        //[neer=23, neeaj=83, nj=13, neeraj=63]




        //traversing the all the entries of HashMap methods


        //First for each method
        System.out.println();
        System.out.println("First for-each method");
        for (String key:list.keySet()) {
            System.out.printf("Name is %s and id is %d\n", key, list.get(key) );
        }

        System.out.println();
        //Second Map.Entry<> method
        System.out.println("Second mathod");
        for(Map.Entry<String, Integer> val : list.entrySet()){
            System.out.printf("Name is %s and id is %d\n", val.getKey(), val.getValue());
        }


        System.out.println();
        //Third method is the improved version of second method
        //just replace "Map.Entry<String, Integer>" to "var" & java will intelligently know the data type
        System.out.println("Improved version of second method");
        for(var val : list.entrySet()){
            System.out.printf("Name is %s and id is %d\n", val.getKey(), val.getValue());
        }
    }

    public static void main(String[] args) {
        hashMap();
    }
}
