package com.abhishek.tutorial.linkedlist;

public class LinkList{
	Node root;
	public void addAtBeg(int data)
	{
		Node newNode = new Node(data);
		newNode.next=root;
		root=newNode;
	}
	public Node removeAtBeg()
	{
		
		
		if(root!=null)
		{
			root=root.next;
			return root;
		}
		else
		{
			System.out.println("Sorry Linked List is empty!!!");
			return null;
		}
	}
	
	
	public Node removeAtEnd()
	{
		Node current =root;
		Node prev=root;
		

	     if(root==null)
	      {
	    	  System.out.println("Sorry Linked List is empty!!!"); 
	    	  return null;
	      }
		
		else
		{
			while(current.next!=null)
			{
				prev=current;
				current=current.next;
			}
			//If it's the root element or the linked list only has one node
			if(current==root)
			{
				root=null;
			}
			else
			{
				prev.next=null;
			}
			return current;
		}
		
		}
		
	
	
	public void append(int data)
	{
		Node newNode = new Node(data);
		
		if(root == null)
		{
			newNode.next=null;
			root=newNode;
		
		}
		else 
			{
			Node looper = root;   
				while(looper.next!=null)
					{
						looper=looper.next;
					}
				looper.next=newNode;
				newNode.next=null;
			}
		
	}
	public Node removeAfter(int data)
	{
		Node current=root;
		Node prev=root;
		
		if(root == null)
		{
			System.out.println("Linkedlist is Empty!!");
			return null;
		}
		
		else
		{
               while(current.getData()!=data)
               {
            	   if(current.next==null)
            	   {
            		   System.out.println("Node not found!!!");
            		   return null;
            		   
            	   }
            	   else
            	   {
            		   prev=current;
            		   current=current.next;
            	   }
               }
               
               if(current==root)
               {
            	   root=current.next;
               }
               else
               {
            	   prev.next=current.next;
               }
        return current;
		}
	}
	
    void display()
    {
    	Node looper = root;
    	while(looper!=null)
    	{
    		looper.display();
    		looper=looper.next;

    	}
    }
//    void addAfter(int data,int nodeData)
//    {
//    	Node newNode= new Node(data);
//    	Node current=root;
//    	Node prev=root;
//    	if(root==null)
//    	{
//    		root=newNode;
//    		newNode.next=null;
//    	}
//    	else
//    	{
//    		
//    	}
//    	
//    }
    
    void reverseLinkedList()
    {
    	     Node prev=null;
    	     Node current=root;
    	     Node nexttoCurrentNode=null;
    	     
    	     if(root==null)
    	     {
    	    	
    	 			System.out.println("Linkedlist is Empty!!");
    	 			return;
    	 	}
    	     else
    	     {
    	    	   
    	    	   while(current!=null)
    	    	    {
    	    		  //Store the next node to current in "nexttoCurrentNode" so that when we point 
    	    		  //current Node's next Node to prev we can still traverse through the list
    	    		  nexttoCurrentNode=current.next;
    	    	    	  //reverse the link from current going to the prev link
    	    		  current.next=prev;
    	    		  //Move prev to current Node
    	    	    	  prev=current;
    	    	    	  //Move current Node to it's "original" next Node
    	    	    	  current=nexttoCurrentNode;
    	    	    	  
    	    	    }
    	    	    root=prev;
    	     }
    }

}
