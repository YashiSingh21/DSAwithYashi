class Solution {
    
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans=new ArrayList<>();
         char[][] board=new char[n][n];
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j]='.';
            }
        }
          queen(0, board, ans, n);
           return ans;
    }

    public void queen(int row, char[][] board, List<List<String>> ans, int n) {
        if (row==n) {
            ans.add(display(board));
            return;
        }
        
        for (int col= 0; col< n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col]='Q';
                queen(row+1, board, ans, n);
                board[row][col]='.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col, int n) {
    
        for (int i= 0; i<row; i++) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
         for (int i= row-1, j= col-1; i>=0&&j>=0; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
            
        }
        
        for (int i= row-1, j =col+1; i>=0&&j<n; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
         return true;
    }

    public List<String> display(char[][] board) {
        List<String> result=new ArrayList<>();
        for (int i=0; i< board.length; i++) {
            result.add(new String(board[i]));
        }
        return result;     
    }
}
