package Linked_List;

import org.w3c.dom.Node;

public class LLNEW {

    private Node head;
    private Node tail;
    private int size;

    public LLNEW() {
        this.size = 0;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }

}
