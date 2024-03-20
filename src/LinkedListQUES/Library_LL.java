package LinkedListQUES;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class Library_LL{
    public static void main(String[] args) {


        LinkedList<String> node = new LinkedList<>();

        node.add("Hello");
        node.add("My");
        node.add("Name");
        node.add("is");
        node.add("Neeraj");

        Iterator<String> itr=node.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + "___");

        }

        }
}
