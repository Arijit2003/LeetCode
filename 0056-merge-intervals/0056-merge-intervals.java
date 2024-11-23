class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> arrLst = new ArrayList<>();
        arrLst.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[]temp=intervals[i];
            int[]listarr=arrLst.get(arrLst.size()-1);
            if(temp[0]>=listarr[0] && temp[0]<=listarr[1]){
                listarr[1]=Math.max(temp[1],listarr[1]);
            }else arrLst.add(temp);
        }
        int[][]res = new int[arrLst.size()][2];
        int i=0;
        for(int[] temp:arrLst){
            res[i++]=temp;
        }
        return res;
    }
}