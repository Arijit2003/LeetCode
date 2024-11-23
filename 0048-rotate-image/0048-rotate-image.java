class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length,temp;
        for(int k=0;k<n;k++){
            int i=0,j=n-1;
            while(i<j){
                temp=matrix[i][k];
                matrix[i][k]=matrix[j][k];
                matrix[j][k]=temp;
                i++;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}