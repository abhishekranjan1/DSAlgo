
package com.abhishek.tutorial.examples;
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      
      for(char ch : Str.toCharArray())
      {
      System.out.print(ch);
      }
   }
}