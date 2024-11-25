class Solution {
    public int reversePairs(int[] nums) {
     
        return mergesort(nums,0,nums.length-1);
    }
    int countPairs(int[]arr, int low, int mid, int high){
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++){
            while(right<=high  && arr[i]>2*(long)arr[right] )right++;
            count+=(right-(mid+1));
        }
        return count;
    }
    int mergesort(int[]nums, int l, int h){
        int count=0;
        if(l<h){
            int r=(l+h)/2;
            count+=mergesort(nums,l,r);
            count+=mergesort(nums,r+1,h);
            count+=countPairs(nums,l,r,h);
            merge(nums,l,r,h);
        }
        return count;
    }
    void merge(int[]arr, int l, int r, int h){
        int m=r-l+1, n=h-r;
        int[]left=new int[m];
        int[]right=new int[n];
        for(int i=l;i<=r;i++){
            left[i-l]=arr[i];
        }
        for(int i=r+1;i<=h;i++){
            right[i-(r+1)]=arr[i];
        }
        int i=0,j=0,k=l;
        while(i<m && j<n){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<m){
            arr[k++]=left[i++];
        }
        while(j<n){
            arr[k++]=right[j++];
        }
    }
}