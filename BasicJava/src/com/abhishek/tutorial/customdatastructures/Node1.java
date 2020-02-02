package com.abhishek.tutorial.customdatastructures;

// Node
public class Node1 {
    public int data;

    // Lower values indicate higher priority
    public int priority;

    public Node1 next;

    public Node1() {
    }

    public int getData() {
        return data;
    }

    public Node1(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Node1 getNext() {
        return next;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }
}
