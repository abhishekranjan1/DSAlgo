package com.abhishek.tutorial.deepaligraph;

public class Demo1DirectedGraph {

	public static void main(String[] args) {
		
		DirectedGraph g= new DirectedGraph();
		g.insertVertex("one");
		g.insertVertex("two");
		g.insertVertex("three");
		
		g.insertEdge("one", "three");
		g.insertEdge("two", "three");
		
		
		g.display();
		
		System.out.println("Vertices= "+g.no_of_Vertices()+", Edges= "+g.no_of_Edges());
		

	}

}
