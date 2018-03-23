package com.abhishek.tutorial.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharacterFrequencyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("a");list.add("a");list.add("a");list.add("b");list.add("b");list.add("b");list.add("a");list.add("a");
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String ch:list)
		{
			Integer counter = map.get(ch);
			if(counter == null)
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch,counter+1);
			}
			 	
			
		}
		

		System.out.println(map.size());
        System.out.println(map);	
		
		

	}

}
