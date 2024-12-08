class Solution {
    static List<List<Integer>> res ; 
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        res = new ArrayList<>();
        combination(nums,0,nums.length,target,new ArrayList<Integer>());
        return res;   
    }
    
    public void combination(int[] nums, int idx,int n,int target, ArrayList<Integer> temp ){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=idx;i<n;i++){
            if(i!=idx && nums[i]==nums[i-1])continue;
            if(target>=nums[i]){
                temp.add(nums[i]);
                combination(nums,i+1,n,target-nums[i],temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}