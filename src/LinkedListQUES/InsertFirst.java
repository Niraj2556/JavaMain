package LinkedListQUES;

import java.sql.SQLOutput;


public class InsertFirst {

    public class Node {
        Node next;
        int value;

        public Node(int data){
            this.value = data;
        }
    }
    public Node head;
    public Node tail;
    public void AddFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
    }



    public void displav(){
        Node temp = head;
        while (temp != null){

            System.out.print(temp.value +  " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void duplicates(){
        Node tempo = head;

        while(tempo.next != null ){
            if (tempo.value == tempo.next.value){
                tempo.next = tempo.next.next;
//                size--;

            }else{
                tempo = tempo.next;
            }
        }
        tail = tempo;
        tempo.next = null;





    }


    public static void main(String[] args) {
        InsertFirst list  = new InsertFirst();

        list.AddFirst(2);
        list.AddFirst(4);
        list.AddFirst(4);
        list.AddFirst(4);
        list.AddFirst(6);

        list.displav();
//        list.duplicates();
//        list.displav();

    }
}
