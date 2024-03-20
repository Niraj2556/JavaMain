//package LinkedListQUES;
//
//import java.util.LinkedList;
//
//public class findCycle {
//
//    public class Node{
//        private Node next;
//        private int value;
//
//
//        public Node(int value) {
//            this.value = value;
//        }
//    }
//
//    //Find where the cycle is present or not
//    public boolean haCycle(Node head) {
//        Node fast = head;
//        Node slow = head;
//        while(fast !=  null && fast.next != null){
//            if(fast == slow){
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//    // Find the size of Cycle
//    public int hasCycle(Node head) {
//        Node fast = head;
//        Node slow = head;
//        while(fast !=  null && fast.next != null){
//            if(fast == slow){
//                //main code to calculate length
//                Node temp = slow;
//                int size = 0;
//                do {
//                    temp = temp.next;
//                    size++;
//                }while (temp == slow){
//                    return size;
//                }
//            }
//        }
//        return -1;
//    }
//
//
//
//    public static void main(String[] args) {
//
//    }
//}
