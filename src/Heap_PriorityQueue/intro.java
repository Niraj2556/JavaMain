package Heap_PriorityQueue;

import java.util.PriorityQueue;

public class intro {

    //Priority Queue implementation
//    1> add()    ---> O(log n)

//    2> remove()    -----> O(log n)

//    3> peek()        -----> O(1)

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
 }
