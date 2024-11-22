class Solution {
    public int maxSubArray(int[] nums) {
        int[]prefix=new int[nums.length];
        prefix[0]=nums[0];
        int sum=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            prefix[i]=Math.max(sum,nums[i]);
            max=Math.max(max,prefix[i]);
            sum=Math.max(sum,nums[i]);
        }
        return max;

    }
}