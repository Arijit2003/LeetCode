class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,n=nums.length,temp;
        while(j<n){
            if(nums[i]==nums[j])j++;
            else{
                i++;
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return i+1;
    }
}