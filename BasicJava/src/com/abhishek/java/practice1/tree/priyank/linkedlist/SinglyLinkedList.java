package com.abhishek.java.practice1.tree.priyank.linkedlist;
public class SinglyLinkedList {
    // 2,4,6    (642)
    //8,0,9    (+908)
    //0,5,5,1  (1550)
    public static void main(String[] args) {
        SinglyLinkedListNode num1 = getNewNode(2);
        SinglyLinkedListNode currentNode1 = num1;
        currentNode1 = addNewNode(currentNode1, 4);
        currentNode1 = addNewNode(currentNode1, 6);
        currentNode1.next = null;

        SinglyLinkedListNode num2 = getNewNode(8);
        SinglyLinkedListNode currentNode2 = num2;
        currentNode2 = addNewNode(currentNode2, 0);
        currentNode2 = addNewNode(currentNode2, 9);
        currentNode2.next = null;

        SinglyLinkedListNode result = sumTwoLists(num1, num2);
        traverseLinkedList(result);
    }

    public static SinglyLinkedListNode sumTwoLists(SinglyLinkedListNode num1, SinglyLinkedListNode num2){

        SinglyLinkedListNode head = null;
        SinglyLinkedListNode current = null;
        int carryOver = 0;
        while(num1 != null || num2 != null){
            int sum = (num1 == null ? 0 : num1.data) + (num2 == null ? 0 : num2.data) + carryOver;
            current  = addNewNode(current, sum%10);
            if(head == null){
                head = current;
            }
            carryOver = sum/10;
            if(num1 != null) num1 = num1.next;
            if(num2 != null) num2 = num2.next;
        }

        if(carryOver > 0){
            current  = addNewNode(current, carryOver);
            if(head == null)
                head = current;
        }

        return head;
    }

    public static SinglyLinkedListNode getNewNode(int data){
        return new SinglyLinkedListNode(data);
    }

    public static SinglyLinkedListNode addNewNode(SinglyLinkedListNode current,  int data){
        SinglyLinkedListNode newNode = getNewNode(data);
        if(current == null) return  newNode;
        current.next = newNode;
        current = current.next;
        return current;

    }

    public static void traverseLinkedList(SinglyLinkedListNode node){
        if(node == null) return;
        System.out.println(node.data);
        traverseLinkedList(node.next);
    }
}



