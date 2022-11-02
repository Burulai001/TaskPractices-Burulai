package com.cydeo.leetcode;

public class LinkedListCycleSolution {

public static ListNode detectCycle(ListNode head) {

    if(head == null||head.next == null)
        return null;
// create two pointer
    ListNode fast = head;
    ListNode slow = head;

    // Advance both at different speeds until they meet once

    while(fast != null&&fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;

// As soon as they meet,start from the head again and move at the same speed
        if(slow == fast) {
            while(head != slow) {
                head = head.next;
                slow = slow.next;
            }
            return slow;
        }
    }
    return null;
}



public static void main(String[] args) {
        ListNode listNode=new ListNode(3);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(0);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=listNode.next;
        System.out.println(detectCycle(listNode).val);

  }

}
