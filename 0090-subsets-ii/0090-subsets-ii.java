class Solution {
    static List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        subsets(0,nums,nums.length,new ArrayList<Integer>());
        return res;
    }
    public void subsets(int idx,int[]nums,int n,ArrayList<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=idx;i<n;i++){
            if(i!=idx && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            subsets(i+1,nums,n,temp);
            temp.remove(temp.size()-1);
        }
        
    }
}