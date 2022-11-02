package com.cydeo.linkedList;

public class ListNode {
    int value;
    ListNode next;
    int size;
    ListNode tail;

    public ListNode(int value) {

        this.value = value;
    }


    public void add(ListNode head) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
        } else {
            head.next = node;
        }
        size++;
    }


    public int sum(ListNode head) {
        int sum = 0;
        ListNode current = head;
        while (current != null) {
            sum += current.value;
            current = current.next;
        }
        return sum;
    }

    public int sumRecursive(ListNode head) {

        if (head == null)
            return 0;
        return head.value + sumRecursive(head.next);

    }


    public boolean findTarget(ListNode head, int target) {

        ListNode current = head;
        while (current != null) {
            if (current.value == target)
                return true;
            current = current.next;
        }
        return false;
    }


    public boolean findTargetRec(ListNode head, int target) {
        if (head == null)
            return false;
        if (head.value == target)
            return true;
        return findTargetRec(head.next, target);
    }


    public void deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    public int getValueRec(ListNode head, int index) {

        if (head == null) return 0;
        if (index == 0) return head.value;

        return getValueRec(head.next, index - 1);

    }


    public int getValue(ListNode head, int index) {
        ListNode current = head;
        int count = 0;

        while (current != null) {
            if (count == index) return current.value;
            count++;
            current = current.next;
        }
        return 0;
    }


    public int reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;

        while (current!=null){

            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev.value;
    }






}
