class Solution {
    static List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res= new ArrayList<>();
        combination(candidates, target, candidates.length,new ArrayList<>());
        return res;
        
    }
    public void combination(int[]candidates, int target, int n,ArrayList<Integer> temp){
        if(n==0 && target==0){
            res.add(new ArrayList<>(temp));
            return ;
        }
        if(n==0 && target!=0) return ;

        //not take
        combination(candidates, target, n-1,temp);
        //take
        if(target>=candidates[n-1]){
            temp.add(candidates[n-1]);
            combination(candidates, target-candidates[n-1], n,temp);
            temp.remove(temp.size()-1);
        }
    }
}