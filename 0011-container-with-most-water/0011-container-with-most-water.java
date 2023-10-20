class Solution {
    public int maxArea(int[] arr) {
        int left=0,emptbars,minH=0,maxWater=0;
        int right=arr.length-1;
        while(left<right){
            emptbars=right-left;
            minH=Math.min(arr[left],arr[right]);
            maxWater=Math.max(maxWater,(emptbars*minH));
            if(arr[left]<arr[right])
                left++;
            else 
                right--;
        }
        return maxWater;
    }
}