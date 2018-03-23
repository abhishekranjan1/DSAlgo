package com.abhishek.tutorial.examples;

// Selection Sort

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = new int[]{7,3,9,2,1,5};
       
		
				  
		for(int i=0;i<arr.length-1;i++)
		{
			int min = i;
			 for (int j=i+1;j<arr.length;j++)
				{
					if(arr[min]>arr[j])
					{
						min = j;
					}
					else continue;
				}
				
			// swap(arr[min],arr[i]);
			
			 int temp=0;
			  temp = arr[i];
			  arr[i]=arr[min];
			  arr[min]=temp;
	
		}
		
		for(int i=0;i<arr.length;i++)
		{
		 System.out.print(arr[i]+",");
		}
		
				
	}
	/*
	private static void swap(List<Integer> digits, int a, int b)
	{
		int temp=0;
		temp = a;
		a=b;
		b=temp;
	}
*/
}
