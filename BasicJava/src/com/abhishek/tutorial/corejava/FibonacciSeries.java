package com.abhishek.tutorial.corejava;
public class FibonacciSeries {
	
	private static int[] arr;
	
	public FibonacciSeries(int n)
	{
		arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=-1;
		}
	}
	
	public int fibMemo(int n)
	{
		if(n<=1) return n;
		if(arr[n]!=-1) return arr[n];
			
			arr[n] = fibMemo(n-1)+fibMemo(n-2);
			return arr[n];
	}
	
	
	
	public static void main(String[] args)
	{
		
		FibonacciSeries obj = new FibonacciSeries(26);
		int number =obj.fibMemo(5);
		System.out.println(number);
		
	}
	
	
}
