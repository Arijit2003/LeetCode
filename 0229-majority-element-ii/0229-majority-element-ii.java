class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int e: nums){
            hmap.put(e,hmap.getOrDefault(e,0)+1);
        }
        for(int key:hmap.keySet()){
            if(hmap.get(key)>n/3)res.add(key);
        }
        return res;
    }
}