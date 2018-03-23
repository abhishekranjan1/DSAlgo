package com.abhishek.tutorial.examples;



public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a =palindrome("ABCBA");
		System.out.println(a);
		
		boolean b =palindrome("ARSEDS");
		System.out.println(b);
	
	}
   
	private static boolean palindrome(String str)
   {
		 //ArrayList<Character> word = new ArrayList<Character>(); 
		// if(str==null) return false;
		
			int left = 0;
			int right = str.length()-1;
			
							
		   while(left<(str.length())/2 && right>(str.length())/2)
			{
				if(str.charAt(right) == str.charAt(left))
				{
					right--;
					left++;
				}
			   else return false;
			}
			
			return true;
			
		
	}
		
}

