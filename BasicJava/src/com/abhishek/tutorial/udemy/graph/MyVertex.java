package com.abhishek.tutorial.udemy.graph;

import java.util.List;

public class MyVertex {
    private char data;
    private boolean visited;
    private List<Vertex> neighborList;

    public char getData() {
        return data;
    }

    public MyVertex(char data) {
        this.data = data;
    }

    public void setData(char data) {
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
}
