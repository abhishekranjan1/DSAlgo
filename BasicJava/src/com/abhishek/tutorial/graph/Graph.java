package com.abhishek.tutorial.graph;


import java.util.LinkedList;
import java.util.List;

class Graph{
	
	List<Edge> G[];
	@SuppressWarnings("unchecked")
	public Graph(int n){
		G=new LinkedList[n];
		for(int i=0;i<G.length;i++)
			G[i]=new LinkedList<Edge>();
	}
	boolean isConnected(int u,int v){
		for(Edge i: G[u])
			if(i.v==v) return true;
		return false;
	}
	void addEdge(int u,int v,int w){
		G[u].add(0,new Edge(v,w)); 
	}
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<G.length;i++)
			result+=i+"=>"+G[i]+"\n";
		return result;
	}
}