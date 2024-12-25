class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-2,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(mid%2!=0 && nums[mid-1]==nums[mid])low=mid+1;
            else if(mid%2==0 && nums[mid]==nums[mid+1])low=mid+1;
            else high=mid-1;
        }
        return nums[low];
    }
}