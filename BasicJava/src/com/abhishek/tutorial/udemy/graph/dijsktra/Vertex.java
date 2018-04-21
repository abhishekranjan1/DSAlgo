package com.abhishek.tutorial.udemy.graph.dijsktra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
	
	private String name;
	private boolean isVisited;
	private List<Edge> adjList;
	private Vertex prev;
	private double distance=Double.MAX_VALUE;
	
	
	public Vertex(String name) {
		super();
		this.name = name;
		adjList = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	public List<Edge> getAdjList() {
		return adjList;
	}
	public void addNeighbor(Edge e) {
		adjList.add(e);
	}
	public Vertex getPrev() {
		return prev;
	}
	public void setPrev(Vertex prev) {
		this.prev = prev;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public String toString()
	{
		return name;
	}
	@Override
	public int compareTo(Vertex otherVertex) {
		// TODO Auto-generated method stub
		return Double.compare(this.distance, otherVertex.distance);
	}

}
