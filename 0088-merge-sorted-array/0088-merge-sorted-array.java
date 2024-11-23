class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m=nums1.length;
        for(int i=m-n,j=0;i<m;i++){
            nums1[i]=nums2[j++];
        }
        Arrays.sort(nums1);
    }
}