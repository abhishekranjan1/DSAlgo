package com.abhishek.tutorial.examples;
import java.util.HashMap;

public class Anagram
{
 public static void main(String[] args)
 {
  String a = "listen";
  String b = "enlist";
  System.out.println(isPermutation(a, b));
 }

 private static boolean isPermutation(String a, String b)
 {
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	for(char ch:a.toCharArray())
	  {
		if(map.containsKey(ch))
			map.put(ch, map.get(ch)+1);
		else
			map.put(ch, 1);
	}
	
	for(char ch:b.toCharArray())
	  {
		if(!map.containsKey(ch))
			return false;
		//Next condition is very important
		
		if(map.get(ch)==1)
			map.remove(ch);
		
		else
			map.put(ch, map.get(ch)-1);
	}
	if(map.keySet().size()==0) 
		
		return true;
	else
		return false;
 }
 
}
 
 
 
 /*
 private static boolean isPermutation(String a, String b)
 {
  Map < Character, Integer> charMap = new HashMap < Character, Integer>();
  for (char ch : a.toCharArray())
  {
   if (charMap.containsKey(ch))
    charMap.put(ch, charMap.get(ch) + 1);
   else
    charMap.put(ch, 1);
  }
  for (char ch : b.toCharArray())
  {
   if (!charMap.containsKey(ch))
    return false;
   if (charMap.get(ch) == 1)
    charMap.remove(ch);
   else
    charMap.put(ch, charMap.get(ch) - 1);
  }
  if (charMap.keySet().size() == 0)
   return true;
  return false;
 }

}
 
 */