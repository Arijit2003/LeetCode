class Solution {
    static boolean[] dp=new boolean[1000000+1];
    static {
        getPrime(1000000,dp);
    }
    public int[] closestPrimes(int left, int right) {
        int[] res={-1,-1};
        int prev=-1,curr=-1,mindiff=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(dp[i]){
                curr=i;
                if(prev!=-1 && curr-prev<mindiff){
                    mindiff=curr-prev;
                    res[0]=prev; res[1]=curr;
                }
                prev=curr;
            }
        }
        return res;
    }
    public static void getPrime(int n,boolean []dp){
        Arrays.fill(dp,true);
        dp[0]=false; dp[1]=false;
        dp[2]=true; dp[3]=true; int j=2;
        for(int i=2;i*i<=n;i++){
            j=2;
            while(i*j<=n){
                dp[i*j]=false;
                j++;
            }
        }
    }
}