package com.abhishek.tutorial.linkedlist;

public class DoublyLinkList{
	DoublyNode root;
	public void addAtBeg(int data)
	{
		DoublyNode newNode = new DoublyNode(data);
		
		if(root==null)
		{
			root=newNode;
			newNode.next=newNode.prev=null;
		}
		else
			{
			    newNode.next=root;
			    root=newNode;
			   	root.prev=newNode;
			   	
			}	
	}
	public DoublyNode removeAtBeg()
	{
		DoublyNode current= root;
		
		if(root==null)
		{
			System.out.println("Sorry Linked List is empty!!!");
			return null;
		}
		else
		{
			if(root.next==null)
			{
				root=null;
				return root;
			}
			
			else
			{
				root=current.next;
				current.next.prev=null;	
			}		
		}
		return current;
	}
	
	
	public DoublyNode removeAtEnd()
	{
		DoublyNode current =root;
		DoublyNode prev=root;
		

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
			//If it's the root element or the linked list only has one DoublyNode
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
			DoublyNode newNode = new DoublyNode(data);

			if(root == null)
			{
				newNode.next=newNode.prev=null;
				root=newNode;

			}
			else
				{
				  DoublyNode current = root;
					while(current.next!=null)
						{
							current=current.next;
						}
					current.next=newNode;
					newNode.next=null;
					newNode.prev=current;
				}
		
	}
	public DoublyNode removeAfter(int data)
	{
		DoublyNode current=root;
		DoublyNode prev=root;
		
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
            		   System.out.println("DoublyNode not found!!!");
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
            	   current.next.prev=null;
               }
               else
               {
            	      if(current.next==null)
            	      {
            	    	  	prev.next=null;
            	    	  	
            	      }
            	      else
            	      {
            	    	  	   prev.next=current.next;
                   	   current.next.prev=prev;
            	      }
            	  
               }
        return current;
		}
	}
	
    void display()
    {
    	DoublyNode looper = root;
    	while(looper!=null)
    	{
    		looper.display();
    		looper=looper.next;

    	}
    }
    

}
