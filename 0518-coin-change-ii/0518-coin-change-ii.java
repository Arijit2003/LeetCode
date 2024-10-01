class Solution {
    public int change(int amount, int[] coins) {
        return  getWays(coins, coins.length, amount);
    }
    public int getWays(int[]coins, int n, int sum){
        // if(amount<0)return 0;
        // if(n==0 && amount==0)return 1;
        // if(n==0 && amount!=0) return 0;
        // return  getWays(coins, n, amount-coins[n-1])+getWays(coins,n-1,amount);
        int dp[][]=new int[sum+1][n+1];
        for(int i=0;i<=n;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<=sum;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i][j-1];//not take
                if(i>=coins[j-1]){
                    dp[i][j]+=dp[i-coins[j-1]][j];
                }
            }
        }
        return dp[sum][n];
    }
}