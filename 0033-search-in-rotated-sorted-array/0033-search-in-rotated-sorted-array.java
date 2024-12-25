class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int k=findPivot(nums,n);
        if(k==-1){
            return binarySearch(nums,0,n-1,target);
        }else{
            return Math.max(binarySearch(nums,0,k-1,target),binarySearch(nums,k,n-1,target));
        }

    }
    //finding the smallest element is equivalent to finding the pivot element
    public int findPivot(int[]nums,int n){
        int low=0,high=nums.length-1,mid;
        if(n==1)return -1;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>=nums[0])low=mid+1;
            else{
                if(nums[mid]>nums[mid-1])high=mid-1;
                else return mid;
            }
        }
        return -1;
    }
    int binarySearch(int[]arr,int low,int high,int target){
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target)low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}