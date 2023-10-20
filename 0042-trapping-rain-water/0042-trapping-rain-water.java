class Solution {
    public int trap(int[] arr) {
        int len=arr.length;
        int leftbars[]=new int[len];
        int rightbars[]=new int[len];
        //left bars
        leftbars[0]=arr[0];
        for(int i=1;i<len;i++){
            leftbars[i]=Math.max(arr[i],leftbars[i-1]);
        }
        //right bars
        rightbars[len-1]=arr[len-1];
        for(int j=len-2;j>=0;j--){
            rightbars[j]=Math.max(arr[j],rightbars[j+1]);
        }
        int trapwater=0;
        int minH;
        for(int i=0;i<len;i++){
            minH=Math.min(leftbars[i],rightbars[i]);
            trapwater+=minH-arr[i];
        }
        return trapwater;
    }
}