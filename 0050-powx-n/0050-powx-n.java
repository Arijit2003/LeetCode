class Solution {
    public double myPow(double x, int n) {
        if(x==1 || (x==-1 &&  n>0))return x;
        if(x==-1 && n<0)return 1;
        if(n==Integer.MAX_VALUE||n==Integer.MIN_VALUE)return 0;
        double[] dp = new double[Math.abs(n)+1];
        Arrays.fill(dp,-1);
        if(n<0){
            return 1/pow(x,Math.abs(n),dp);
        }return pow(x,n,dp);
    }
    public double pow(double x, int n,double[]dp){
        if(n==0)return dp[n]=1;
        if(n==1)return dp[n]=x;
        if(dp[n]!=-1)return dp[n];
        if(n%2==0)return dp[n]=pow(x,n/2,dp)*pow(x,n/2,dp);
        else return dp[n]=x*pow(x,n-1,dp);
    }
}