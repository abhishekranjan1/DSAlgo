package com.abhishek.tutorial.udemy.graph;

import java.util.List;
import java.util.Stack;

public class DFS {
private Stack<Vertex> stack;
	
	public DFS()
	{
		stack = new Stack<>();
	}
	
	public void dfs(List<Vertex> vertices)
	{
		for(Vertex v:vertices)
		{
			if(!v.isVisited())
			{
				 
				dfsWithStack(v);
				//dfsRecursive(v);
			}
		}
		
	}
	public void dfsRecursive(Vertex root)
	{
	    
		 root.setVisited(true);
		 System.out.println(root+", ");
	    
	    for(Vertex v: root.getNeighborList())
	    {
	    	     if(!v.isVisited())
	    	     {
	    	    	 	v.setVisited(true);
	    	    	 	dfsRecursive(v);
	    	     }
	    }
	}
	
	
	public void dfsWithStack(Vertex root)
	{
		
		root.setVisited(true);
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			Vertex actualVertex = stack.pop();
			System.out.print(actualVertex+", ");
			
			for(Vertex v: actualVertex.getNeighborList())
			{
				  if(!v.isVisited())
				  {
					  v.setVisited(true);
					  stack.push(v);
				  }
			}
		}
		
	}

}
