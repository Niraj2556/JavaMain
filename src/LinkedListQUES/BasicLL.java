package LinkedListQUES;

public class BasicLL{


    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Node head = null;
    public Node tail = null;

//
//
//    public void AddLast(int data){
//        if(tail == null){
////            AddFirst(data);
//            return;
//        }
//
//        Node node1 = new Node(data);
//        tail.next = node1;
//        node1 = tail;
//
//    }
//
//    public void AddAtAnyWhere(Node data , int index){
//        Node val = new Node(data);
//        //Finding Size of list
//        int size = 0;
//        while (head != null){
//            head = head.next;
//            size++;
////        }
//
//
//    }
//
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->" );
            temp = temp.next;
        }
        System.out.println("End");
    }


}
