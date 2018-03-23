package com.abhishek.tutorial.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNeutrals {

	public static void main(String[] args) {
		for (int i = 1;i<256;i++) {
		    System.out.println("i="+i+" -> "+RomanNumerals(i));
		  }

	}
	
	public static String RomanNumerals(int Int) {
	    LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
	    roman_numerals.put("M", 1000);
	    roman_numerals.put("CM", 900);
	    roman_numerals.put("D", 500);
	    roman_numerals.put("CD", 400);
	    roman_numerals.put("C", 100);
	    roman_numerals.put("XC", 90);
	    roman_numerals.put("L", 50);
	    roman_numerals.put("XL", 40);
	    roman_numerals.put("X", 10);
	    roman_numerals.put("IX", 9);
	    roman_numerals.put("V", 5);
	    roman_numerals.put("IV", 4);
	    roman_numerals.put("I", 1);
	    String res = "";
	    
	     for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
	      
	    	 int number = entry.getValue();
	    	 String RomanBaseString = entry.getKey();
	    	 int matches = Int/number;
	      
	      // repeat method in next line repeat the string 'n' no of time and the syntax is repeat(String,integer)
	      
	      res += repeat(RomanBaseString, matches);
	      Int = Int % number;
	    }
	    return res;
	  }
	  public static String repeat(String s, int n) {
	    if(s == null) {
	        return null;
	    }
	    final StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++) {
	        sb.append(s);
	    }
	    return sb.toString();
	  }

}
