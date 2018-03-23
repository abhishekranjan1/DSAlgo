package com.abhishek.tutorial.examples;

import java.util.Arrays;


public class LeastDifference
{
 public static void main(String[] args)
 {
  int[]arr={64,57,2,78,43,73,53,86};
  Arrays.sort(arr);
  int minDiff=Integer.MAX_VALUE;
  for(int i=0;i < arr.length-1;++i)
  {
   int diff=Math.abs(arr[i]-arr[i+1]);
   if(diff < minDiff)
    minDiff=diff;
   else continue;
  }
  System.out.println(minDiff);
 }
}