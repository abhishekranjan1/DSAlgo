package com.abhishek.tutorial.corejava;

public class BitWiseMod {


public int findRequiredNum(int arr[], int N) {

        int countSetBit[] = new int[32];


        for (int i = 0; i < arr.length; i++) {

        for (int k = 0; k < 32; k++) {
        int kthSetBit = 1 << k;

        if ((arr[i] & kthSetBit) == kthSetBit)
        countSetBit[k]++;
        }
        }

        int occurredOnce = 0;
        for (int i = 0; i < 32; i++) {
        countSetBit[i] = countSetBit[i] % N;
        if (countSetBit[i] == 1)
        occurredOnce = occurredOnce | (1 << i);
        }
        return occurredOnce;
        }


public static void main(String args[]) {
        int[] arr = { 5, 5, 4, 8, 4, 5, 8, 9, 4, 8 };
        System.out.print("Input Matrix : " );

        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + "  " );

        BitWiseMod solution = new BitWiseMod();


        System.out.println("\n\nThe number which occured only once is: "  + solution.findRequiredNum(arr, 3));
        }
        }

