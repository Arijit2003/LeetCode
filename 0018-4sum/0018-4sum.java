class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hset = new HashSet<>();
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0;i<=nums.length-4;i++){
            for(int j=i+1;j<=nums.length-3;j++){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]); temp.add(nums[j]);
                int k=j+1,l=nums.length-1;
                long tsum=0;
                while(k<l){
                    tsum=(long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                    if(tsum==target){
                        temp.add(nums[k]); temp.add(nums[l]);
                        hset.add(temp);
                        temp=new ArrayList<>();
                        temp.add(nums[i]); temp.add(nums[j]);
                        k++; l--;
                    }else if(tsum<target) k++;
                    else l--;
                }
            }
        }
        res.addAll(hset);
        return res;
    }
}