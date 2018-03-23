package com.abhishek.tutorial.linkedlist;

public class Node {
	
	private int data;
	Node next;
	//private Node previous;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node(int data) {
		super();
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	public void display(){
		
		        System.out.println(data);
		
		    }

	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		
		LinkList newList = new LinkList();
		newList.addAtBeg(35);
		newList.addAtBeg(22);
		newList.addAtBeg(28);
		// newList.removeAtEnd();
		
		
		newList.removeAfter(28);
		newList.removeAfter(35);
		newList.removeAfter(586);
		//newList.removeAfter(586);
	//	newList.removeAfter(35);
//		newList.removeAtBeg();
//		newList.removeAtBeg();
//		newList.removeAtBeg();
//		newList.removeAtBeg();
//		newList.removeAtBeg();
		//newList.append(88);
		//newList.append(96);
		
		// newList.removeAtEnd();
	//newList.removeAtEnd();
	    newList.display();
		
		
	}
	
	

}
