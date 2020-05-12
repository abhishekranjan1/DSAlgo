package com.abhishek.tutorial.dynamicprogramming;

public class SubSetSum {
    static boolean isdpSum(int nums[], int sum) {
        boolean dp[][] = new boolean[nums.length + 1][sum + 1];
        for (int i = 0; i <= sum; i++) dp[0][i] = false;
        for (int i = 1; i <= nums.length; i++) dp[i][0] = true;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (!dp[i][j] && j >= nums[i - 1])
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i - 1]];
            }
        }
        showSums(dp,nums,sum);
        return dp[nums.length][sum];
    }

    /* Driver program to test above function */
    public static void main (String args[])
    {
        int nums[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        if (isdpSum(nums, sum) == true)     System.out.println("Found a dp" + " with given sum");
        else    System.out.println("No dp with" + " given sum");
    }
    public static void showSums(boolean[][] dp, int nums[], int sum){
        int i = nums.length;
        int j = sum;
        while(j > 0 || i > 0 ){

            if( dp[i][j] == dp[i-1][j] ){
                i = i - 1;
            }else{
                System.out.println("We take item: " + nums[i-1]);
                j = j - nums[i-1];
                i = i - 1;
            }
        }
    }
}
