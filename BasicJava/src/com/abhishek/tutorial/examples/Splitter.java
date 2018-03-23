package com.abhishek.tutorial.examples;

public class Splitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = "I,am ,Legend, , oh ,you ?".split(",");
		
		
		// String[] tokens = "I	am	Legend		oh	you	?".split("//");
		
		for (String token : tokens)
		{
		    System.out.println(token);
		}

	}

}
