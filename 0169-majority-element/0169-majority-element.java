class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int n=nums.length;
        for(int e:nums){
            hmap.put(e,hmap.getOrDefault(e,0)+1);
            if(hmap.get(e)>n/2)return e;
        }
        return -1;

    }
}