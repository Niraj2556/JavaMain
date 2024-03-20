package LinkedListQUES;

public class intersection_of_two_LL {

    //    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public class Solution {
            public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
                ListNode nodeA = headA;
                ListNode nodeB = headB;

                int lengthA = 0;
                while (nodeA != null) {
                    lengthA++;
                    nodeA = nodeA.next;
                }
                int lengthB = 0;
                while (nodeB != null) {
                    lengthB++;
                    nodeB = nodeB.next;
                }
                nodeA = headA;
                nodeB = headB;

                if (lengthA > lengthB) {
                    int stepN = lengthA - lengthB;
                    for (int i = 0; i < stepN; i++) {
                        nodeA = nodeA.next;
                    }
                } else {
                    int stepN = lengthB - lengthA;
                    for (int i = 0; i < stepN; i++) {
                        nodeB = nodeB.next;
                    }
                }

                while (nodeA != nodeB) {
                    nodeA = nodeA.next;
                    nodeB = nodeB.next;
                }
                return nodeA;

            }
        }
    }
}