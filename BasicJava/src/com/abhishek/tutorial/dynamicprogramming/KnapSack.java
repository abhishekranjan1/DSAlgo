package com.abhishek.tutorial.dynamicprogramming;
public class KnapSack {
    public void solve(int[] weights, int[] profits, int capacity) {
        int[][] dp  = new int[weights.length+1][capacity+1];
        // time complexity: O(N*W)
        for(int i=1;i<weights.length+1;i++) {
            for(int w=1;w<capacity+1;w++) {
                int notTakingItem = dp[i-1][w]; // not taking item i
                int takingItem = 0;
                if( i< weights.length && weights[i] <= w ) {
                    takingItem = profits[i] + dp[i-1][w-weights[i]];
                }
                dp[i][w] = Math.max(notTakingItem, takingItem);
            }
        }
        int totalBenefit = dp[weights.length][capacity];
        System.out.println("Total benefit is: "+totalBenefit);
        showResult(dp,weights, capacity);
    }
    public void showResult(int[][] dp, int[] weights, int capacity) {
        for(int n=weights.length, w = capacity;n>0;n--) {
            if( dp[n][w] != 0 && dp[n][w] != dp[n-1][w] ) {
                System.out.println("We take item: #"+n);
                w = w - weights[n];}
             } }
    public static void main(String[] args){
        int capacity = 5;
        int[] weights = {4,2,3};
        int[] profits = {10,4,7};
        KnapSack knapsack = new KnapSack();
        knapsack.solve(weights, profits, capacity);
    }
}

