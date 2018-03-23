package com.abhishek.tutorial.examples;

public class caseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =3 ;
		int b=2;
		switch(a)
		{
		case 1: 
			b=a+3;
			
		case 2: 
			b=a+2;
			
		case 3: 
			b=a*5;
		case 4: 
			b=a-3;
		default: 
			b=a*2;
					
		}
      System.out.println(b);
	}

}
