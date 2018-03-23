package com.abhishek.tutorial.examples;

import java.util.*;

public class TestSplit {

	public static void main(String[] args) {

		String test = "abc.def.123";
		String[] output = test.split("\\.");

		//alternative
		//String[] output = test.split(Pattern.quote("."));

		System.out.println(output[0]);
		System.out.println(output[1]);
		System.out.println(output[2]);
		
		System.out.println(repeat("Hello",5));

	}

	private static List<String> repeat(String string, int n) {

		List<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			list.add(string);
		}
		return list;
	}



}
