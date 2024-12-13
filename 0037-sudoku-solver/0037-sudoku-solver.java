class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(isSafe(board,i,j,ch)){
                            board[i][j]=ch;
                            if(solve(board))return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSafe(char[][]board,int r,int c, char ch){
        int row,col;
        for(int i=0;i<9;i++){
            if(board[r][i]==ch)return false;
            if(board[i][c]==ch)return false;
            row=3*(r/3)+(i/3);
            col=3*(c/3)+(i%3);
            if(board[row][col]==ch)return false;
        }
        return true;
    }
}