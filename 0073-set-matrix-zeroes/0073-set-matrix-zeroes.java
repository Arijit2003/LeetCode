class Pair{
    int row,col;
    Pair(int row, int col){
        this.row=row; this.col=col;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length, cols=matrix[0].length;
        ArrayList<Pair> arrLst = new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0) arrLst.add(new Pair(i,j));
            }
        }
        for(Pair p: arrLst){
            //rows
            for(int i=0;i<cols;i++){
                matrix[p.row][i]=0;
            }
            //cols
            for(int i=0;i<rows;i++){
                matrix[i][p.col]=0;
            }
        }
    }
}