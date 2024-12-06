class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][]dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int val=denomination(coins.length-1,amount, coins,dp);
        return (val>=1000000000)?-1:val;
    }
    public int denomination(int idx, int amount, int[]coins,int[][]dp){
        if(idx==0){
            if(amount % coins[idx]==0) return dp[idx][amount]=amount/coins[idx];
            else{
                return dp[idx][amount]=(int)1e9;
            }
        }
        if(dp[idx][amount]!=-1)return dp[idx][amount];
        int notTake = 0+denomination(idx-1,amount,coins,dp);
        int take=Integer.MAX_VALUE;
        if(amount>=coins[idx]) take=1+denomination(idx,amount-coins[idx],coins,dp);
        return dp[idx][amount]=Math.min(take,notTake);
    }
}