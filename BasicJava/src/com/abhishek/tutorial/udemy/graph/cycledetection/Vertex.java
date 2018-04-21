package com.abhishek.tutorial.udemy.graph.cycledetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int name;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> neighborList;
	public int getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Vertex [name=" + name + "]";
	}
	public void setName(int name) {
		this.name = name;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public boolean isBeingVisited() {
		return beingVisited;
	}
	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}
	public List<Vertex> getNeighborList() {
		return neighborList;
	}
	public void setNeighborList(List<Vertex> neighborList) {
		this.neighborList = neighborList;
	}
	public Vertex(int name) {
		super();
		this.name = name;
		neighborList = new ArrayList<>();
	}
	
	public void addNeighbor(Vertex v)
	{
		neighborList.add(v);
	}
}
