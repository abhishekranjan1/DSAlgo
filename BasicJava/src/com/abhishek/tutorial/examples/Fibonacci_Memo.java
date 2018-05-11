package com.abhishek.tutorial.examples;
public class Fibonacci_Memo {
 
 
private static int fibArray[]=new int[26];
 
public static int fibonacci(int n){
	if(n<=1)
	{
		return n;
	}
	if (fibArray[n]!=-1) 
	{
		return fibArray[n];
	}

	fibArray[n]=fibonacci(n-1)+fibonacci(n-2);
	return fibArray[n];

}
 
 
 public static void main(String args[]){
  
  for(int i=0;i<26;i++)
  	{
	  fibArray[i]=-1;
  	}
  long preTime=System.currentTimeMillis();
  System.out.println("Value of 25th number in Fibonacci series->"+fibonacci(25));
  long postTime=System.currentTimeMillis();
  System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));
  
  
 }
}