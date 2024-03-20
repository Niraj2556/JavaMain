package Set_HashSet;

import java.util.*;

public class intro {
    public static void main(String[] args)
    {
        // Demonstrating Set using HashSet
        // Declaring object of type String

        Set<String> hash_Set = new HashSet<>();



        //List
        List<Integer> list_set = new ArrayList<>();

        list_set.add(1);
        list_set.add(2);
        list_set.add(3);
        list_set.add(4);
        list_set.add(5);

        Iterator itr = list_set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }









        // Adding elements to the Set
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
//        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        hash_Set.add("Example");

        hash_Set.add("Example");


//        System.out.println(hash_Set.isEmpty());



        // Printing elements of HashSet object
//        System.out.println(hash_Set);
    }
}
