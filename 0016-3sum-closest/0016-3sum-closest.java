class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int c_sum=0,minSum=0,minDiff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int j,k;
        for(int i=0;i<nums.length-1;i++){
            c_sum=target-nums[i];
            j=i+1;k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==c_sum){
                    minDiff=Math.min(0,minDiff);
                    return target;
                }else if(nums[j]+nums[k]<c_sum){
                    if(c_sum-(nums[j]+nums[k])<minDiff){
                        minDiff=c_sum-(nums[j]+nums[k]);
                        minSum=nums[i]+nums[j]+nums[k];
                    }
                    j++;
                }else{
                    if((nums[j]+nums[k])-c_sum<minDiff){
                        minDiff=(nums[j]+nums[k])-c_sum;
                        minSum=nums[i]+nums[j]+nums[k];
                    }
                    k--;
                }
            }
        }
        return minSum;
    }
}