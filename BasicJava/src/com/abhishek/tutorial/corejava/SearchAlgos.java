package com.abhishek.tutorial.corejava;

import java.util.Arrays;

public class SearchAlgos {
	
	static int[] array = { 23,45,11,63,9,14,16,28,99,67};

	public static void main(String[] args) {
		
	//	int[] array = { 23,45,11,63,9,14,16,28,99,67};
		int i= linearSearch(array,14);
		int j= linearSearch(array, 8);
		System.out.println(i+", "+j);
		
		Arrays.sort(array);
		for(int x=0;x<array.length;x++)
		        System.out.print(array[x]+", ");
		
		int k= binarySearch(array,14);
		int l= binarySearch(array, 8);
		
		System.out.println();
		System.out.println(k+", "+l);

	}
	
	static int linearSearch(int[] array, int n)
	{
		for(int i=0;i<array.length;i++) {
			if(array[i]==n)
			{
				return i;
			}
		}
		return -1;
	}
	
	static int binarySearch(int[] array, int n)
	{
		
		int startIndex=0;
		int endIndex=array.length;
		while(endIndex>startIndex)
		{
			int middleIndex=(endIndex-startIndex)/2;
			if(array[middleIndex]==n) return middleIndex;
			else if(n>array[middleIndex])
			{
				startIndex=middleIndex+1;
			}
			else if(n<array[middleIndex])
			{
				endIndex=middleIndex-1;
			}
		}
		return -1;
		}
	
//	static int binarySearchRecursive(int startIndex,int endIndex, int n)
//	{
//
//		int middleIndex=(endIndex-startIndex)/2;
//		
//		// If we have recursed through the array but did not find anything
//		if(endIndex<startIndex)
//		{
//			System.out.println("Sorry the item was not found in the array!!!");
//			return -1;
//		}
//		//If the element is found
//		if(n==array[middleIndex])
//		{
//			return middleIndex;
//		}
//		
//		if(n>array[middleIndex])
//		{
//			return binarySearchRecursive(middleIndex+1,endIndex, n);
//		}
//		else if(n>array[middleIndex])
//			{
//				return binarySearchRecursive(startIndex,middleIndex-1, n);
//			}
//		
//		}
//		
		
}


