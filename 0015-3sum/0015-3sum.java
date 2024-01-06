class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hSet=new HashSet<>();
        ArrayList<Integer> arrLst;
        int sum=0,c_sum=0,j,k;
        for(int i=0;i<nums.length;i++){
            c_sum=sum-nums[i];
            j=i+1;k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==c_sum){
                    arrLst = new ArrayList<>(3);
                    arrLst.add(nums[i]);
                    arrLst.add(nums[j]);
                    arrLst.add(nums[k]);
                    hSet.add(arrLst);
                    j++;k--;
                }else if(nums[j]+nums[k]<c_sum) j++;
                else k--;
            }
            
        }
        List<List<Integer>> res= new ArrayList<>(hSet);
        return res;
    }
}