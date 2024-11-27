class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,ArrayList<Integer>> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i],new ArrayList<Integer>());
            }
            hmap.get(nums[i]).add(i);
        }
        int []res =new int[2];
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(target-nums[i])){
                if((target-nums[i]!=nums[i])){
                    res[0]=i; res[1]=hmap.get(target-nums[i]).get(0);
                    return res;
                }else if(hmap.get(nums[i]).size()>=2){
                    res[0]=i; res[1]=hmap.get(nums[i]).get(1);
                    return res;
                }   
            }
        }
        res[0]=-1; res[1]=-1;
        return res;
    }
}