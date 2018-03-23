package com.abhishek.tutorial.examples;

import java.util.HashMap;

public class WordFrequency
{
 public static void main(String[] args)
 {
	     HashMap<String,Integer> map=new HashMap<String,Integer>();
	 
	 		// TODO Auto-generated method stub
	 		String[] tokens = "I,am ,Legend, , oh ,you,am,am,Legend,Legend,am ?".split(",");
	 		for (String token : tokens)
	 		{
	 		    if(map.containsKey(token))
	 		    	map.put(token, map.get(token)+1);
	 		    else 
	 		    	map.put(token,1);
	 		}
	 		
	 		for (String name: map.keySet()){

	            String key =name.toString();
	            String value = map.get(name).toString();  
	            System.out.println(key + " - " + value);  


	} 

	 	}

	 }

 