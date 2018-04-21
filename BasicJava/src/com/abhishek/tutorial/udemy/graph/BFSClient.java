package com.abhishek.tutorial.udemy.graph;

import java.util.ArrayList;
import java.util.List;

public class BFSClient {

	public static void main(String[] args) {
	BFS bfs = new BFS();
	
	Vertex v1 = new Vertex(1);
	Vertex v2 = new Vertex(2);
	Vertex v3 = new Vertex(3);
	Vertex v4 = new Vertex(4);
	Vertex v5 = new Vertex(5);
	// Vertex v6 = new Vertex(6);
	List<Vertex> list = new ArrayList<>();
	
	v1.addNeighbor(v3);
	v1.addNeighbor(v5);
	v3.addNeighbor(v2);
	v3.addNeighbor(v4);
	// v4.addNeighbor(v2);
	
	
	list.add(v1);
	list.add(v2);
	list.add(v3);
	list.add(v4);
	list.add(v5);
//	list.add(v6);
	
	
	
//	bfs.bfsTemp(list);
//	System.out.println();
	bfs.bfs(list);
//	System.out.println();
//	bfs.bfs(v3);
//	System.out.println();
//	bfs.bfs(v4);
//	System.out.println();
//	bfs.bfs(v2);

	}

}
