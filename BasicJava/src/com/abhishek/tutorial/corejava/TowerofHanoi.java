package com.abhishek.tutorial.corejava;

public class TowerofHanoi {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'B';
		char ch3 = 'C';
		pegMovement(ch1,ch2,ch3,3);

	}
  static void pegMovement(char A,char B, char C, int n)
  {
	  if (n>0) 
	  {
	  pegMovement(A,C,B,n-1);
	  
	  System.out.println("Move the top disc from "+A+" to "+C);
	  
	  pegMovement(B,A,C,n-1);
	  }
	  
  }
}
