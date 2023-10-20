class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int emptbars;
        int minH=0;
        int maxWater=0;
        int trial;
        int currq;
        while(left<right){
            emptbars=right-left;
            minH=Math.min(arr[left],arr[right]);
            maxWater=Math.max(maxWater,(emptbars*minH));
            if(arr[left]<arr[right])
                left++;
            else if(arr[right]<=arr[left])
                right--;
            // else{
            //     trial=left+1;
            //     minH=Math.max(arr[trial],arr[right]);
            //     emptbars=right
            // }
            
        }
        return maxWater;
    }
}