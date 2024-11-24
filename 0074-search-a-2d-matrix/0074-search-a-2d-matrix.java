class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowpos=-1,rows=matrix.length,cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            if(target>=matrix[i][0] && target<=matrix[i][cols-1]){
                rowpos=i;
                break;
            }
        }
        if(rowpos==-1)return false;
        for(int i=0;i<cols;i++){
            if(target==matrix[rowpos][i])return true;
        }
        return false;
    }
}