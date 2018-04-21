package com.abhishek.tutorial.adjlistgraph;

import java.util.*;

class Edge<T,K>
{
	public T v;   
	K w;
	public Edge(T vertex,K weight) { v=vertex; w=weight; }
}

class GraphAdjacencyList<T,K>
{
	Map<T, List< Edge<T,K>> > G;
	Set<T> vertices; // vertices is set of all vertices
	GraphAdjacencyList()
	{
		G=new HashMap<T, List<Edge<T,K>> >();
		vertices=new HashSet<>();
	}
	void addEdge(T u,T v,K weight)
	{
		if(!G.containsKey(u))
			G.put(u, new LinkedList<Edge<T,K>>() );
		G.get(u).add(0, new Edge<T,K>(v,weight));
		vertices.add(u); vertices.add(v);	
	}
	
	void BFS(T start_vertex)
	{
		LinkedList<T> queue=new LinkedList<>();
		Map<T,Boolean> visited=new HashMap<>();
		for(T i: vertices) 
			visited.put(i, (i==start_vertex?true:false));
		queue.add(start_vertex);
		while(!queue.isEmpty())
		{
			T explore=queue.removeFirst();
			System.out.print(explore+",");
			if(!G.containsKey(explore)) continue; // to avoid NullPointerException
			for(Edge<T,K> iterator: G.get(explore))
			{
				if(!visited.get(iterator.v)) {
					visited.put(iterator.v,  true); 
					queue.add(iterator.v);
				}
			}
		}
	}
}

public class BreadthFirstSearch {
	public static void main(String[] args) {
		GraphAdjacencyList<String,Integer> g=new GraphAdjacencyList<>();
		g.addEdge("Goa", "Nagpur", 10);
		g.addEdge("Goa", "Kanpur", 15);
		g.addEdge("Kanpur", "Kolkata", 11);
		g.addEdge("Kolkata", "Delhi", 20);
		g.BFS("Goa");
		System.out.println();
		g.BFS("Kolkata");
		
	}
}
