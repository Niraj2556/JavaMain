package LinkedListQUES;

public class reverseLinkedListNth {
    public class ListNode{
        int value;
        ListNode next;

        public ListNode(int value){
            this.value = value;
        }
    }

    public BasicLL.Node head = null;
    public BasicLL.Node tail = null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; ++i) {
            prev = prev.next;
        }

        ListNode current = prev.next;

        for (int i = 0; i < right - left; ++i) {
            ListNode nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }

}
