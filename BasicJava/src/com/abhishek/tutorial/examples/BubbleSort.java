package com.abhishek.tutorial.examples;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{7,3,9,2,1,5};
		
		for(int j=0;j<arr.length;j++)
		{
				for(int i=0;i<arr.length-j-1;i++)
				{
					 
					 if(arr[i]>arr[i+1])
							{
								  int temp=0;
								  temp = arr[i];
								  arr[i]=arr[i+1];
								  arr[i+1]=temp;
							}
							else continue;
				}
					
		 }
	 	

		for(int i=0;i<arr.length;i++)
		{
		 System.out.print(arr[i]+",");
		}

	}

}
