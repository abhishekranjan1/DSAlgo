package com.dsalgo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p1 = new Parent(1,"Abhishek");
		Parent p2 = p1;
		System.out.println(p2.equals(p1));
		System.out.println(p2==p1);

	}

}
