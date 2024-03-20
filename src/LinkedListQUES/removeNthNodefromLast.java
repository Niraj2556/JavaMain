//package LinkedListQUES;
//
//import java.util.LinkedList;
//
//public class removeNthNodefromLast {
//    public class ListNode{
//        ListNode next;
//        int val;
//
//        ListNode(int value){
//            this.val = value;
//            this.next = next;
//        }
//
//        public ListNode head;
//
//    }
//
//    public ListNode removeFromLast(ListNode head, int n){
//        if(head.next == null)
//        {
//            return null;
//        }
//
//        //Find size of List
//        int size = 0;
//        ListNode temp = head;
//
//        while (temp != null){
//            temp = temp.next;
//            size++;
//        }
//
//        //if the "n" == size then return head.next
//
//        if (n == size){
//            return head.next;
//        }
//
////        Search the node
//        int index = size - n;
//        ListNode prev = head;
//        int i = 0;
//        while (i < index){
//            prev = prev.next;
//            i++;
//        }
//        prev.next = prev.next.next;
//        return head;
//    }
//
//    public void disp(){
//        ListNode tempo = head;
//        while (tempo != null){
//            System.out.println(tempo.val + "-->");
//            tempo = tempo.next;
//        }
//    }
//    public void main(String[] args) {
////        LinkedList node = new LinkedList<>();
////        node.add(45);
////        node.add(76);
////        node.add(33);
////        node.add(13);
////        node.add(23);
////        node.add(10);
//
//
//    }
//}
