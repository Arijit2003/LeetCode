class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n], right[]=new int[n];
        previousSmallerElement(heights,left);
        nextSmallerElement(heights,right);
        int maxarea=0,area=0;
        for(int i=0;i<n;i++){
            area=heights[i]*(right[i]-left[i]-1);
            maxarea=Math.max(area,maxarea);
        }
        return maxarea;
        
    }
    public void previousSmallerElement(int[]arr, int left[]){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])st.pop();
            if(st.isEmpty())left[i]=-1;
            else left[i]=st.peek();
            st.push(i);
        }
    }

    public void nextSmallerElement(int[]arr, int right[]){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])st.pop();
            if(st.isEmpty())right[i]=n;
            else right[i]=st.peek();
            st.push(i);
        }
    }
}