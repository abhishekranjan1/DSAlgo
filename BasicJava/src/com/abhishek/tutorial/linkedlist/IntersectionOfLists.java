package com.abhishek.tutorial.linkedlist;

public class IntersectionOfLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headASize = 0;
        int headBSize = 0;
        ListNode currentA=headA;
        ListNode currentB = headB;
        while(currentA!=null){
            headASize ++;
            currentA = currentA.next;
        }
        while(currentB!=null){
            headBSize ++;
            currentB = currentB.next;
        }
        if(currentA!=currentB) return null;

        currentA=headA;
        currentB = headB;
        if(headBSize > headASize)
        {
            for(int i=0; i<(headBSize-headASize); i++){
                currentB = currentB.next;
            }
        }
        else{
            for(int i=0; i<(headASize-headBSize); i++){
                currentA = currentA.next;
            }

        }

        while(currentA!=currentB){
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return currentA;
    }
}
