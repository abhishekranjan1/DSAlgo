package com.abhishek.tutorial.udemy.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int data;
	private boolean visited;
	private List<Vertex> neighborList;

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public List<Vertex> getNeighborList() {
		return neighborList;
	}
	public void setNeighborList(List<Vertex> neighborList) {
		this.neighborList = neighborList;
	}
	public Vertex(int data) {
		
		this.data = data;
		this.neighborList = new ArrayList<>();
		
	}
	
	@Override
	public String toString() {
		return "Vertex [data=" + data + "]";
	}
	
	public void addNeighbor(Vertex vertex)
	{
		neighborList.add(vertex);
	}

}
