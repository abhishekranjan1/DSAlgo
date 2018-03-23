package com.abhishek.tutorial.examples;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int[] arr = new int[10];
		arr[0]=0;
		arr[1]=1;
		
		for(int i=0;i<8;i++)
		{
			arr[i+2]=arr[i]+arr[i+1];
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+",");
		}
		*/
		
		int n1=0;
		int n2=1;
		System.out.print(n1);
		System.out.print(","+n2);
		for (int i=0;i<10;i++)
		{
			int n3 = n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}
