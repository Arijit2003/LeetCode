class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res;
        
        HashSet<List<Integer>> unique = new HashSet<>();
        List<List<Integer>> temp;
        for(int i=0;i<=nums.length-4;i++){
            temp = threeSum(nums, target-nums[i],i+1);
            if(!temp.isEmpty()){
                for(List<Integer> arrLst: temp){
                    arrLst.add(nums[i]);
                    Collections.sort(arrLst,(n1,n2)-> n1-n2);
                    unique.add(arrLst);
                }
            }
        }
        res=new ArrayList<>(unique);
        return res;
    }
    // array should be sorted
    public List<List<Integer>> threeSum(int[] nums,int target,int p) {
        HashSet<List<Integer>> hSet=new HashSet<>();
        ArrayList<Integer> arrLst;
        int sum=target,c_sum=0,j,k;
        for(int i=p;i<=nums.length-3;i++){
            if((long)((long)sum-nums[i])<Integer.MIN_VALUE || (long)((long)sum-         
                nums[i])>Integer.MAX_VALUE){
                List<List<Integer>>res=new ArrayList<>();
                return res;
            }
            c_sum=sum-nums[i];
            j=i+1;k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==c_sum){
                    arrLst = new ArrayList<>(3);
                    arrLst.add(nums[i]);
                    arrLst.add(nums[j]);
                    arrLst.add(nums[k]);
                    Collections.sort(arrLst,(n1,n2)-> n1-n2);
                    hSet.add(arrLst);
                    j++;k--;
                }else if(nums[j]+nums[k]<c_sum) j++;
                else k--;
            }
            
        }
        List<List<Integer>> res= new ArrayList<>(hSet);
        return res;
    }
}