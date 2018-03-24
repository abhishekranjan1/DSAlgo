package com.abhishek.tutorial.linkedlist;

public class DoublyNode {
	
	private int data;
	DoublyNode next;
	DoublyNode prev;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyNode(int data) {
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
		
		DoublyLinkList newList = new DoublyLinkList();
		newList.addAtBeg(35);
		newList.addAtBeg(22);
		newList.addAtBeg(28);
//		 newList.removeAtEnd();
//		 newList.removeAtEnd();
//		 newList.removeAtEnd();
//      	 newList.removeAtEnd();
//	
		
		newList.removeAfter(28);
		newList.removeAfter(35);
		newList.removeAfter(586);
		//newList.removeAfter(586);
	//	newList.removeAfter(35);
//		newList.removeAtBeg();
//	   newList.removeAtBeg();
//		newList.removeAtBeg();
//		newList.removeAtBeg();
//		newList.removeAtBeg();
		//newList.append(88);
		//newList.append(96);
		
		// newList.removeAtEnd();
	//newList.removeAtEnd();
	    System.out.println("Content of the Doubly Linked List are:");
		newList.display();
		
		
	}
	
	

}
