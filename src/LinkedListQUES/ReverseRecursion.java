package LinkedListQUES;

public class ReverseRecursion {


    private class Node{
        Node next;
        int value;

        Node(int value){
            this.value = value;
            this.next = null;
        }


    }

    public Node head;
    public Node tail;


    public void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail =node;
        tail.next =null;
    }

    public static void main(String[] args) {

    }
}
