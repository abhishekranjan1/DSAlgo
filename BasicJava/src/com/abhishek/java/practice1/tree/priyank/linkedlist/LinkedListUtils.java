package com.abhishek.java.practice1.tree.priyank.linkedlist;

public class LinkedListUtils {

    //Implement singelton pattern for Utils class
    private static LinkedListUtils instance;

    private LinkedListUtils() {

    }

    public static LinkedListUtils getInstance(){
        if(instance == null){
            synchronized (LinkedListUtils.class){
                if(instance == null)
                    instance = new LinkedListUtils();
            }
        }
        return instance;
    }


    public SinglyLinkedListNode getNewNode(int data){
        return new SinglyLinkedListNode(data);
    }

    public SinglyLinkedListNode addNewNode(SinglyLinkedListNode current,  int data){
        SinglyLinkedListNode newNode = LinkedListUtils.getInstance().getNewNode(data);
        if(current == null) return  newNode;
        current.next = newNode;
        current = current.next;
        return current;

    }

    public void traverseLinkedList(SinglyLinkedListNode node){
        if(node == null) return;
        System.out.println(node.data);
        traverseLinkedList(node.next);
    }
}
