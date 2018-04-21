package com.abhishek.tutorial.temp;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
//		List<Integer> list= new LinkedList<>();
//		
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(10);
//		list.add(0,120);
//		
//		System.out.println(list);
		
@SuppressWarnings("unchecked")
List<Integer> list[]= new LinkedList[10];

for(int i=0;i<10;i++)
{
	list[i]=new LinkedList<Integer>();
}

		
		list[0].add(20);
		list[0].add(30);
		list[0].add(40);
		list[1].add(10);
		list[2].add(120);
		
		System.out.println(list[0]);
		System.out.println(list[1]);
		System.out.println(list[2]);
		
		
		

	}

}
