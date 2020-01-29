package com.abhishek.tutorial.corejava;

public class ArrayRotation {
    public static void main(String[] args){
        int[] chars = {1,2,3,4,5,6,7};
        int[] rev = rotate(chars,3);
        for(int i: rev){
            System.out.print(i+"->");
        }
    }

     static int[] rotate(int[] nums, int k) {
        if(nums == null || nums.length < 2) return nums;
        int n = nums.length;
        k = k%n;
        System.out.println("n="+n+" & k="+ k);
        rev(nums, 0, n-k-1);
        rev(nums, n-k, n-1);
        rev(nums, 0,n-1);
        return nums;

    }

    static void rev(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] =nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
