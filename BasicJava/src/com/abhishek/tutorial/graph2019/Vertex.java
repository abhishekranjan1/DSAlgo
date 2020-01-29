package com.abhishek.tutorial.graph2019;

public class Vertex {
    String name;
    Neighbor adjList;
    Vertex(String name, Neighbor neighbors) {
        this.name = name;
        this.adjList = neighbors;
    }
}
