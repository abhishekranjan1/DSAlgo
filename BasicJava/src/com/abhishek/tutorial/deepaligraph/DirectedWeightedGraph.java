package com.abhishek.tutorial.deepaligraph;

public class DirectedWeightedGraph {
	final int MAX_VERTICES=30;
	//No of vertices
	int n;
	
	//No of edges
	int e;
	
	int[][] adj;
	
	Vertex[] vertexList;
	
	public DirectedWeightedGraph()
	{
		//Initialize the Graph
		n=e=0;
		adj=new int[MAX_VERTICES][MAX_VERTICES];
		vertexList = new Vertex[MAX_VERTICES];
		for(int i=0;i<MAX_VERTICES;i++)
		{
			for(int j=0;j<MAX_VERTICES;j++)
			{
				adj[i][j]=0;
			}
		}
		
	}
	
	int no_of_Vertices()
	{
		return n;
	}
	
	int no_of_Edges()
	{
		return e;
	}
	
	void display()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
					System.out.print(adj[i][j]+" ");	
			}
			System.out.println();
		}
	}
	
	void insertVertex(String name)
	{
		vertexList[n++]=new Vertex(name);
	}
	
	int getVertexIndex(String name)
	{
		for(int i=0;i<n;i++)
		{
			if(name.equals(vertexList[i].name))
			{
				return i;
			}
		}
			throw new RuntimeException("Invalid Vertex!!!");
	}
	
	boolean edgeExist(String startVertex,String endVertex)
	{
		int startIndex=getVertexIndex(startVertex);
		int endIndex=getVertexIndex(endVertex);
		return(adj[startIndex][endIndex]==0?false:true);
		
	}
	
	void insertEdge(String startVertex,String endVertex, int weight)
	{
		int startIndex=getVertexIndex(startVertex);
		int endIndex=getVertexIndex(endVertex);
		
		if(startIndex==endIndex)
		{
			System.out.println("Sorry!! Start and End Vertex are the same");
			return;
		}
		else if(edgeExist(startVertex,endVertex))
		{
			System.out.println("Sorry!! Edge exists already");
			return;
		}
		else
		{
			adj[startIndex][endIndex]=weight;
			e++;
		}
	}
	
	void removeEdge(String startVertex,String endVertex)
	{
		int startIndex=getVertexIndex(startVertex);
		int endIndex=getVertexIndex(endVertex);
		
		if(startIndex==endIndex)
		{
			System.out.println("Sorry!! Start and End Vertex are the same");
			return;
		}
		else if(!edgeExist(startVertex,endVertex))
		{
			System.out.println("Sorry!! Edge does NOT exist");
			return;
		}
		else
		{
			adj[startIndex][endIndex]=0;
			e--;
		}
	}
	

}
