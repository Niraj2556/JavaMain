package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class sortLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

        public static void main(String[] args) {
            // Create linked lists for the given input
            ListNode list1 = new ListNode(1);
            list1.next = new ListNode(4);
            list1.next.next = new ListNode(5);

            ListNode list2 = new ListNode(1);
            list2.next = new ListNode(3);
            list2.next.next = new ListNode(4);

            ListNode list3 = new ListNode(2);
            list3.next = new ListNode(6);

            // Define the 'lists' array containing the linked lists
            ListNode[] lists = {list1, list2, list3};

            // Call the mergeKLists function with the 'lists' array
            ListNode mergedList = mergeKLists(lists);

            // Print the merged linked list
            printLinkedList(mergedList);
        }

        public static ListNode mergeKLists(ListNode[] lists) {
                if(lists == null || lists.length == 0) return null;

                ListNode head = new ListNode(0);
                ListNode temp = head;
                List<Integer> ans = new ArrayList<>();

                // Iterate through each linked list and extract their values
                for(ListNode list : lists) {
                    while(list != null) {
                        ans.add(list.val);
                        list = list.next;
                    }
                }

                // Sort the extracted values
                Collections.sort(ans);

                // Create a new linked list with sorted values
                for(int val : ans) {
                    temp.next = new ListNode(val);
                    temp = temp.next;
                }

                return head.next; // Return the merged sorted linked list

        }

        public static void printLinkedList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }


}
