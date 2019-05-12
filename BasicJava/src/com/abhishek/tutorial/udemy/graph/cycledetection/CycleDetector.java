package com.abhishek.tutorial.udemy.graph.cycledetection;


import java.util.List;

public class CycleDetector {
//	private List<Vertex> list;
//	
//	public CycleDetector()
//	{
//		list = new ArrayList<>();
//	}
	
	public void cycleDetection(List<Vertex> vertices)
	{
		for(Vertex v: vertices)
		{
			if(!v.isVisited())
			{
				dfs(v);
			}
		}
	}
	
	public void dfs(Vertex root)
	{
		root.setBeingVisited(true);
		
		for(Vertex v: root.getNeighborList())
			{
				if(v.isBeingVisited())
				{
					
					System.out.println("There is a loop here!!! Node:"+v+"is visited again");
					
					return;
				}
				if(!v.isVisited())
				{
					
					v.setVisited(true);
					dfs(v);
				}
			}
		root.setBeingVisited(false);
		root.setVisited(true);
	}

}
