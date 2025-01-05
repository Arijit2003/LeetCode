class MedianFinder {
    ArrayList<Integer> arrLst;

    public MedianFinder() {
        arrLst = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i=-1;
        for(i=0;i<arrLst.size();i++){
            if(arrLst.get(i)>num)break;
        }
        arrLst.add(i,num);
    }
    
    public double findMedian() {
        int n=arrLst.size();
        if(n%2==0) return (arrLst.get(n/2)+arrLst.get(n/2-1))/2.0;
        else return (double)arrLst.get(n/2);
    }
    public void lPartition(int low, int high){
        int pivot=Math.abs(arrLst.get(high)), i=low-1,j;
        for(j=low;j<high;j++){
            if(Math.abs(arrLst.get(j))<pivot){
                i++;
                swap(arrLst,i,j);
            }
        }
        swap(arrLst,i+1,high);
    }
    public void swap(ArrayList<Integer> arrLst,int i, int j){
        int temp=arrLst.get(i);
        arrLst.set(i,arrLst.get(j));
        arrLst.set(j,temp);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */