class Solution {
    static List<List<Integer>> res ; 
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        res = new ArrayList<>();
        // combi(candidates,candidates.length,target, new ArrayList<Integer>());
        // List<List<Integer>> temp = new ArrayList<>();
        // temp.addAll(res);
        // return temp; 
        combination(nums,0,nums.length,target,new ArrayList<Integer>());
        return res;
        
    }
    public void combi(int[] cand, int n, int target, ArrayList<Integer> temp){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return ;
        }
        if(n==0 && target!=0) return ;
        //not take
        combi(cand, n-1, target, temp);
        //take
        if(target>=cand[n-1]){
            temp.add(cand[n-1]);
            combi(cand,n-1,target-cand[n-1],temp);
            temp.remove(temp.size()-1);
        }
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