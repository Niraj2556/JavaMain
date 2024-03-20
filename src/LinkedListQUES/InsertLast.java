//package LinkedListQUES;
//
//import java.util.LinkedList;
//
//public class InsertLast extends InsertFirst {
//    public class Node{
//        Node next;
//        int value;
//
//        Node(int data){
//            this.value= data;
//        }
//    }
//
//    public Node head = null;
//    public Node tail;
//
//
//    public void AddLast(int data){
//        if(tail == null){
//            Node node = new Node(data);
//            node.next = head;
//            head = node;
//            return;
//        }
//
//
//        Node val = new Node(data);
//        tail.next = val;
//        tail = tail.next;
//    }
//
//
//    public static LinkedList merge(LinkedList first, LinkedList second){
//
//    }
//    public void display(){
//        while(head != null){
//            System.out.println(head.value);
//            head = head.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        InsertLast val = new InsertLast();
//        val.display();
//    }
//}
//
