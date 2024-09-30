class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] leftMin =  new int[n];
        int[] rightMax=  new int[n];
        int left=Integer.MAX_VALUE, right=Integer.MIN_VALUE;
        for(int i=0,j=n-1; i<=n-1 && j>=0;i++,j--){
            left = Math.min(left,prices[i]);
            leftMin[i]=left;
            right=Math.max(right,prices[j]);
            rightMax[j]=right;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,rightMax[i]-leftMin[i]);
        }
        return max;
    }
}