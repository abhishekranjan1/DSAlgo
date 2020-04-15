package com.abhishek.tutorial.linkedlist;

public class LinkedListCommonQuestions {

    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        ListNode singlePointer = head;
        ListNode doublePointer = head;

        while(doublePointer!=null && doublePointer.next!=null){
            singlePointer = singlePointer.next;
            doublePointer = doublePointer.next.next;

        }
        return singlePointer;

    }


}
