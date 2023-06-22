class Solution {
    public int removeElement(int[] nums, int val) {
        int[]newArr=new int[nums.length];
        Arrays.fill(newArr,0);
        int count=0;
        int iterator=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++; 
                continue;
            }
            else{
                newArr[iterator]=nums[i];
                iterator++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=newArr[i];
        }
        return nums.length-count;
    }
}