package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class stackVSdeque {
//    public static void stack(){
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.add(2);
//        stack.push(3);
//        stack.add(4);
////        System.out.println(new ArrayList<>(stack)); // prints 1, 2, 3
//        System.out.println(stack);
//    }
    public static void deque(){

        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.add(2);
        deque.push(3);
        deque.add(4);
//        System.out.println(new ArrayList<>(deque));  //print 3,2,1
        System.out.println(deque);
    }

    public static void main(String[] args) {

        System.out.println("Stack");
//        stack();

        System.out.println("Deque");
        deque();
    }
}
