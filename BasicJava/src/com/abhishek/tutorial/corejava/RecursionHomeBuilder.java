package com.abhishek.tutorial.corejava;

public class RecursionHomeBuilder {

	public static void main(String[] args) {
		int n=5;
		dfs(n);

	}
	static void dfs(int n)
	{
		if (n==0) return;
		System.out.println(n);
		dfs(n-1);
		//System.out.println(n);
	}
}
