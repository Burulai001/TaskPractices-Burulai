package com.cydeo.linkedList;

public class ReverseLinkedList {
    int value;
    ListNode next;

    public ReverseLinkedList(int value) {
        this.value = value;
    }

    public ReverseLinkedList(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode reverseListIterative(ListNode head) {
        if (head == null)
            return head;
        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }


    public ListNode reverseListRecursion(ListNode head) {
        if (head == null) return head;
        ListNode[] ans = new ListNode[1];
        reverse(head, ans).next = null;
        return ans[0];
    }
    private ListNode reverse(ListNode head, ListNode[] ans) {
        if (head.next == null) {
            ans[0] = head;
            return head;
        }
        reverse(head.next, ans).next = head;
        return head;
    }

}