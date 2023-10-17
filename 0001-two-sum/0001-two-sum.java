class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        boolean match=false;
        for(int i=0;i<nums.length;i++){
            nums[i]=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    arr[0]=i;
                    arr[1]=j;
                    match=true;
                    break;
                }
            }
            if(match){
                break;
            }
        }
        return arr;
    }
   
}