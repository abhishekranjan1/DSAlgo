package com.abhishek.tutorial.corejava;

public class GCD {

	public static void main(String[] args) {
		
        System.out.println(gcdRecursive(18,12));

	}
 static void gcd(int n1, int n2)
 {
	
	 while(n2!=0)
	 {
		 int temp = n2; 
		 n2=n1%n2;
		 n1=temp;
	 }
	 System.out.println(n1);
 }
 
 static int gcdRecursive(int n1, int n2)
 {
	 if(n2==0) return n1;
	 return gcdRecursive(n2,n1%n2);
 }
}
