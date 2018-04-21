package com.abhishek.tutorial.adjlistgraph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


	
class GraphAdjacencyListTwo<T,K>
{
	
	@SuppressWarnings("hiding")
	class Edge<T,K>
	{
		T v;
		K w;
		public Edge(T v, K w) {
			super();
			this.v = v;
			this.w = w;
		}
	}
	
	Map<T,List<Edge<T,K>>> graph;
	Set<T> vertices;
	public GraphAdjacencyListTwo() {
		
    graph = new HashMap<T,List<Edge<T,K>>>();
    vertices = new HashSet<T>();
	}
	
	public void addEdge(T u, T v, K w)
	{
		if(!graph.containsKey(u))
			graph.put(u,new LinkedList<Edge<T,K>>());
		
		graph.get(u).add(0,new Edge<T,K>(v,w));
		vertices.add(u); vertices.add(v);
	}
	
	
	// Code for Breadth First Search
	
	void BFS(T start_vertex)
	{
		LinkedList<T> queue=new LinkedList<>();
		Map<T,Boolean> visited=new HashMap<>();
		
		for(T vertex: vertices) 
			{
				//The next line will add all the vertices to the HashMap "visited" with false against all the vertices Except for the start_vertex
				visited.put(vertex, (vertex==start_vertex?true:false));
			}
		//Start by adding the given vertex to the queue
		queue.add(start_vertex);
		
	 //Loop through the queue
		while(!queue.isEmpty())
		{
			//Pop the vertex from the queue
			T explore=queue.removeFirst();
			
			//Print the popped item from the queue
			System.out.print(explore+",");
		
			 //If the given key does not exist in the graph continue
			if(!graph.containsKey(explore)) continue;// to avoid NullPointerException
			
			for(Edge<T,K> iterator: graph.get(explore))
			{
				if(!visited.get(iterator.v)) {
					visited.put(iterator.v,  true); 
					queue.add(iterator.v);
				}
			}

		}
	}

}

public class BreadthSearchAdjList {
	
	
	public static void main(String[] args) {
		GraphAdjacencyListTwo<String,Integer> g=new GraphAdjacencyListTwo<>();
		g.addEdge("Goa", "Nagpur", 10);
		g.addEdge("Goa", "Kanpur", 15);
		g.addEdge("Kanpur", "Kolkata", 11);
		g.addEdge("Kolkata", "Delhi", 20);
		g.BFS("Goa");
	}

}
