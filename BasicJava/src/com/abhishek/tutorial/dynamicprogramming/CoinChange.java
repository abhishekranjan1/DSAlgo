package com.abhishek.tutorial.dynamicprogramming;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args){
        int[] coins = {1,2,5};
        int amount =11;
        System.out.println(coinChangeMinimum(coins,amount));
        System.out.println(coinChangeNoOfWays(coins,amount));
    }

    private static int coinChangeMinimum(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0]=0;
        for(int coin=0; coin<coins.length;coin++){
            for(int amt=coin; amt <= amount; amt++){
                if(coins[coin] <= amt)
                    dp[amt] = Math.min(dp[amt],1+dp[amt-coins[coin]]);
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }

    private static int coinChangeNoOfWays(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0]=1;
        for(int coin=0;coin<coins.length;coin++){
            for(int amt=coin; amt <= amount; amt++){
                if(coins[coin] <= amt)
                    dp[amt] +=dp[amt-coins[coin]];
            }
        }
        return dp[amount];
    }
}
