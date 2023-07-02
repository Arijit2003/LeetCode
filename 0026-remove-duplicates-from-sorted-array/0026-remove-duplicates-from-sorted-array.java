class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arrLst = new ArrayList<Integer>();
       
        for(int i=0;i<nums.length;i++){
            if(!arrLst.contains((Integer)nums[i])){
                arrLst.add((Integer)nums[i]);
            }
        }
        
        for(int i=0;i<arrLst.size();i++){
            nums[i]=(int)arrLst.get(i);
        }
        return arrLst.size();
        
    }
}