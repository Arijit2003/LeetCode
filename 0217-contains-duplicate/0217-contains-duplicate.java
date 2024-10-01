class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int e:nums){
            if(hset.contains(e))return true;
            hset.add(e);
        }
        return false;
    }
}