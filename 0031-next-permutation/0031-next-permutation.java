class Solution {
    public void nextPermutation(int[] nums) {
        int pos=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pos=i; break;
            }
        }
        if(pos==-1){
            Arrays.sort(nums);
            return ;
        }
        int smallMax=Integer.MAX_VALUE,idx=-1;
        for(int i=nums.length-1;i>pos;i--){
            if(nums[pos]<nums[i]){
                if(nums[i]<smallMax){
                    smallMax=nums[i];
                    idx=i;
                }
            }
        }
        int temp=nums[pos];
        nums[pos]=nums[idx];
        nums[idx]=temp;
        Arrays.sort(nums,pos+1,nums.length);

    }
}