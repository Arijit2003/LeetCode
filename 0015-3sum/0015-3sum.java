class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hset = new HashSet<>();
        List<Integer> temp; 
        int n=nums.length;
        for(int i=0;i<=n-3;i++){
            int j=i+1,k=n-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    temp=new ArrayList<>();
                    temp.add(nums[i]); temp.add(nums[j]); temp.add(nums[k]);
                    hset.add(temp);
                    j++;k--;
                }else if(nums[i]+nums[j]+nums[k]<0)j++;
                else k--;
            }
        }
        
        List<List<Integer>> res=  new ArrayList<>();
        res.addAll(hset);
        return res;
    }
}