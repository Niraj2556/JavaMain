package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfList {
    public static List<List<Integer>> getListOfLists() {  // function to return list
        List<List<Integer>> mainList = new ArrayList<>();    // creating a List<List<Integer>> and assign variable mainList

        List<Integer> list1 = new ArrayList<>(); // to append the values create a new list of name list1 , & add this in mainList
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>(); // to append the values create a new list of name list1 , & add this in mainList
        list2.add(4);
        list2.add(5);

        List<Integer> list3 = new ArrayList<>(); //to append the values create a new list of name list1 , & add this in mainList
        list3.add(6);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        return mainList;
    }

    public static void main(String[] args) {
        System.out.println(getListOfLists());
    }

}
