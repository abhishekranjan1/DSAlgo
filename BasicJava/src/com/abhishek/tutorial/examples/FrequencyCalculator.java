package com.abhishek.tutorial.examples;
import java.util.ArrayList;
import java.util.HashMap;


public class FrequencyCalculator {
	


	


	        public static void main(String[] args) {
	                // TODO Auto-generated method stub

	                ArrayList<String> list = new ArrayList<>();
	                list.add("abhishek");list.add("abhishek");list.add("aditi");list.add("beena");list.add("beena");list.add("beena");list.add("aditi");list.add("abhishek");

	                HashMap<String,Integer> map = new HashMap<String,Integer>();

	                for(String chr:list)
	                {
	                        Integer counter =  map.get(chr);

	                        map.put(chr,(counter==null)?1:counter+1);

	                }
	                System.out.println(map.size());
	                System.out.println(map);
	        }
	}
