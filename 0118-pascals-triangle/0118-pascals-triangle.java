class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(new ArrayList<>(Collections.nCopies(i,-1)));
        }
        Collections.fill(res.get(0),1);
        if(numRows==1)return res;
        Collections.fill(res.get(1),1);
        for(int i=2;i<numRows;i++){
            int n=res.get(i).size();
            res.get(i).set(0,1);
            res.get(i).set(n-1,1);
            for(int j=1;j<n;j++){
                if(res.get(i).get(j)==-1){
                    res.get(i).set(j,res.get(i-1).get(j)+res.get(i-1).get(j-1));
                }
            }
        }
        return res;
        

        
        
    }
}