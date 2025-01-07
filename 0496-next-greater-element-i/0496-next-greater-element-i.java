class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>st.peek())st.pop();
            if(st.isEmpty()){
                hmap.put(nums2[i],-1);
                st.push(nums2[i]);
            }else {
                hmap.put(nums2[i],st.peek());
                st.push(nums2[i]);
            } 
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hmap.get(nums1[i]);
        }
        return nums1;
    }
}
/*
HashMap<Integer,Integer> hmap = new HashMap<>();
        boolean flag=false;
        for(int i=0;i<nums2.length;i++){
            flag=false;
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[j]>nums2[i]){
                    hmap.put(nums2[i],nums2[j]);
                    flag=true;
                    break;
                }
            }
            if(!flag)hmap.put(nums2[i],-1);
        }
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=hmap.get(nums1[i]);
        }
        return res;
*/