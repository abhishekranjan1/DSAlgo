package com.abhishek.tutorial.examples;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int[] arr = new int[]{7,3,9,2,1,5};
		
		for(int i=1;i<arr.length;i++)
		 {
			for(int j=i;j>0;j--)
			{
				if (arr[j]<arr[j-1])
				{
					int temp=0;
					  temp = arr[j];
					  arr[j]=arr[j-1];
					  arr[j-1]=temp;
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
		