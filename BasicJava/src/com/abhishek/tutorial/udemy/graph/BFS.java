package com.abhishek.tutorial.udemy.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	
	 Queue<Vertex> queue;
	 
	 public BFS()
	 {
		 queue = new LinkedList<>();
	 }
	
	public void bfs(List<Vertex> vertices)
	{
		for(Vertex v: vertices)
		{
			if(!v.isVisited())
			{
				bfsWithQueue(v);
			}
		}
	}
	 
	 public void bfsWithQueue(Vertex root)
	  {
		 
		  root.setVisited(true);
		  queue.add(root);
		  
		  
		  while(!queue.isEmpty())
		  {
			  Vertex actualVertex = queue.remove();
			  System.out.println(actualVertex+", ");
			  
			  for(Vertex v: actualVertex.getNeighborList())
			  {
				  if(!v.isVisited())
				  {
					  v.setVisited(true);
					  queue.add(v);
					  
				  }
			  }
		  }
	  }

}
