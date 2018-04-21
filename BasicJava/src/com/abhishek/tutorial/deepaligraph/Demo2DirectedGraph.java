package com.abhishek.tutorial.deepaligraph;

public class Demo2DirectedGraph {

	public static void main(String[] args) {
		
		DirectedWeightedGraph g= new DirectedWeightedGraph();
		g.insertVertex("one");
		g.insertVertex("two");
		g.insertVertex("three");
		
		g.insertEdge("one", "three",23);
		g.insertEdge("two", "three",656);
		
		
		g.display();
		
		System.out.println("Vertices= "+g.no_of_Vertices()+", Edges= "+g.no_of_Edges());
		

	}

}
