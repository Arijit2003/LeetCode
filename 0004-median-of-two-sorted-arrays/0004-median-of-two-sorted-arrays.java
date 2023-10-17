class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[(nums1.length)+(nums2.length)];
        int n1=0,n2=0;
        for(int k=0;k<arr.length;k++){
            if((n1<=nums1.length-1)&&(n2<=nums2.length-1)){
                if(nums1[n1]<nums2[n2]){
                    arr[k]=nums1[n1];
                    n1++;
                }
                else if(nums1[n1]==nums2[n2]){
                    arr[k]=nums1[n1];
                    arr[k+1]=nums2[n2];
                    n1++;
                    n2++;
                    k++;
                }
                else{
                    arr[k]=nums2[n2];
                    n2++;
                }
            }else if(n1>nums1.length-1){
                arr[k]=nums2[n2];
                n2++;
            }else if(n2>nums2.length-1){
                arr[k]=nums1[n1];
                n1++;
            }
                
        }
        int len=arr.length;
        if(len%2==0){
            return ((arr[(len/2)]+arr[(len/2)-1])/2.0);
        }else{
            return arr[len/2];
        }
    }
}