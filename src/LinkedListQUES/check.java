package LinkedListQUES;

import java.util.LinkedList;
import java.util.List;

public class check {
    public static void check(){
        List list = new LinkedList();
        list.add(123);  // allowed
        Object obj = list.get(0);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {

        check();
    }
}
