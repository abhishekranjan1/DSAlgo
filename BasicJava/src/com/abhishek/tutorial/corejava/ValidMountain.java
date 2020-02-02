package com.abhishek.tutorial.corejava;

public class ValidMountain {
    static boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;
        int i=0;
        if(A[0] > A[1]) return false;

        for(i=1; i< A.length-1;i++){
            if(A[i] > A[i+1]){
                break;
            }
            if(A[i]==A[i+1]){
                return false;
            }
        }
        if(i == A.length-1){
            return false;
        }
        while(i< A.length-1){
            if(A[i] < A[i+1]){
                return false;
            }
            else if(A[i]==A[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String [] args){
        int [] arr = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
        System.out.println(validMountainArray(arr));
    }
}
