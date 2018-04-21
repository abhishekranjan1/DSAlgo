package com.abhishek.tutorial.adjlistgraph;

import java.util.LinkedList;
import java.util.List;

class GraphPractise
{
			class Edge
			{
				// We need the end vertex and weight 
				
			int v;
			int w;
			public Edge(int v, int w) {
				super();
				this.v = v;
				this.w = w;
			    }
			@Override
			public String toString() {
				return "Edge [v=" + v + ", w=" + w + "]";
			    }
			}
	
	List<Edge> list[];
	
	@SuppressWarnings("unchecked")
	public GraphPractise(int n)
	{
		 list=new LinkedList[n];
		 
		 for(int i=0;i<list.length;i++)
		 {
			 list[i] = new LinkedList<Edge>();
		 }
	}
	
	boolean isConnected(int u, int v)
	{
		if(u==v)
		{
			System.out.println("Sorry both the vertex are the same");
			return false;
		}
		
		else
		{
			//Iterate through the linked list of edges at u-1th location in the array
			for(Edge edge: list[u])
			{
				if(edge.v==v) return true;
			}
			return false;
		}
	}
	
	void addEdge(int u, int v, int w)
	{
		list[u].add(0, new Edge(v,w));
	}
	
	public String toString(){
		String result="";
		for(int i=0;i<list.length;i++)
			result+=i+"===>"+list[i]+"\n";
		return result;
	}
	
}

public class AdjListGraphPractise {

	public static void main(String[] args) {
	
		GraphPractise g = new GraphPractise(10);
		g.addEdge(0, 2, 10);
		g.addEdge(0, 5, 15);
		g.addEdge(2, 5, 10);
		g.addEdge(9, 3, 16);
		
		System.out.println(g);
		System.out.println(g.isConnected(9,3));
		

	}

}
