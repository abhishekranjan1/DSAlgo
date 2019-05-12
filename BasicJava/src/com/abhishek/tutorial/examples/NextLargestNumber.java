package com.abhishek.tutorial.examples;

import java.util.ArrayList;
import java.util.List;

public class NextLargestNumber {

	public static void main(String[] args) 
		{
				int n = 5963;
				List<Integer> list = numberToDigits(n);
				int rightindex = -1;
				for(int i=list.size()-1;i>0;i--)
				{
					
					if(list.get(i)>list.get(i-1))
					{
						rightindex = list.get(i);
					    break;
					}
						
				}
		    if(rightindex!=-1)
		    {
		    	swap(list,rightindex,rightindex-1);
		    	sort(list,rightindex,list.size());
		    }
		}
	
	
	// Following are the utility methods to be used for the main code
	
	private static List<Integer> numberToDigits(int n)
	{
		List<Integer> digits = new ArrayList<>();
		
		while(n>0)
		{
			digits.add(n%10);
			n=n/10;
		}
	
		return digits;
	}
	
		@SuppressWarnings("unused")
		private static int digitsToNumber(List<Integer> digits)
		{
		int num = 0;
		
		for(Integer digit:digits)
		{
			num=num*10;
			num = num+digit;
		}
	
		return num;
		}
		
		private static void sort(List<Integer> digits, int startIndex, int endIndex) {
			if (startIndex == endIndex)
				return;
			for (int k = startIndex; k < endIndex - 1; ++k)
				for (int l = startIndex + 1; l < endIndex; ++l) {
					if (digits.get(k) > digits.get(l))
						swap(digits, k, l);
				}

		}

		private static void swap(List<Integer> digits, int i, int j) {
			Integer temp = digits.get(i);
			digits.set(i, digits.get(j));
			digits.set(j, temp);
		}
}
