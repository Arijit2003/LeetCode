class Solution {
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return noOfPaths(0,0,m,n,dp);
    }
    public boolean isSafe(int i, int j, int m, int n){
        if(i<m && j<n)return true;
        return false;
    }
    public int noOfPaths(int i, int j, int m, int n,int[][]dp){
        if(i==m-1 && j==n-1)return dp[i][j]=1;
        if(dp[i][j]!=-1)return dp[i][j];
        int count=0;
        if(isSafe(i+1,j,m,n))count+=noOfPaths(i+1,j,m,n,dp);
        if(isSafe(i,j+1,m,n))count+=noOfPaths(i,j+1,m,n,dp);
        return dp[i][j]=count;
    }
}