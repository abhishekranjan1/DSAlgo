package com.abhishek.tutorial.udemy.graph;
import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {
	private Stack<Vertex> stack;
	public TopologicalOrdering()
	{
		stack = new Stack<>();
	}
	public void dfs(List<Vertex> vertices)
	{
		for(Vertex v: vertices)
		{
			if(!v.isVisited())
			{
				dfsRecursive(v);
			}
		}
	}
	public void dfsRecursive(Vertex root)
	{
		if(root.isVisited()) return;
		else{
			root.setVisited(true);
			for(Vertex v : root.getNeighborList()){
				if(!v.isVisited()){
					dfsRecursive(v);
				}
			}
		}
	stack.push(root);
	}
	public Stack<Vertex> getStack()
	{
		return stack;
	}
}
