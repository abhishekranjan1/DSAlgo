package com.abhishek.tutorial.examples;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,3,6,16,12,22,34,15};
		int min, max;
		min=max=arr[0];
		int i=0;
		for(i=0;i<arr.length/2;i++)
		{
			
			int n1=arr[i*2];
			int n2=arr[i*2+1];
			
				if(n1<n2)
					{
						
					    if(n1<min) min=n1;
					    if(n2>max)  max=n2;
					}
				else
					{
					     if(n1>max) max=n1;
					     if(n2<min) min=n2;
					}
					 /*
					
					   if(n1<min)
							{
								min=n1;
							}
						if(n2>max)
							{
								max=n2;
							}
						
					}
				else
				{
					if(n2<min)
						{
							min=n2;
						}
					if(n2>max)
						{
							max=n1;
						}
					
				}
				*/
		}
		System.out.println(min);
		System.out.println(max);
		

	}

}
