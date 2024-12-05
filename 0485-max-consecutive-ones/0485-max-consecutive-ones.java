class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxct=0,count=nums[0],n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==1) count++;   
            else {
                maxct=Math.max(maxct,count);
                count=0;
            }
        }
        maxct=Math.max(maxct,count);
        return maxct;
    }
}