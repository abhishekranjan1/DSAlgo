package com.abhishek.tutorial.examples;

import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abhishek";
		
		
		ArrayList<Character> word = new ArrayList<Character>(); 
		 
		for(int j=str.length()-1;j>=0;j--)
		{
			word.add(str.charAt(j));
		}
		
		String str1= word.toString();
		System.out.println(str1);
		
	}

}
