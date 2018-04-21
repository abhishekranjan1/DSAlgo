package com.abhishek.tutorial.udemy.graph.cycledetection;

import java.util.ArrayList;
import java.util.List;


public class CycleClient {

	public static void main(String[] args) {
		
       CycleDetector obj = new CycleDetector();
       
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		
		List<Vertex> list = new ArrayList<>();
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		list.add(v6);
		
		v1.addNeighbor(v2);
		v2.addNeighbor(v3);
		v3.addNeighbor(v1);
		v2.addNeighbor(v6);
		v6.addNeighbor(v5);
		v5.addNeighbor(v2);
		
		obj.cycleDetection(list);
		
	}

}
