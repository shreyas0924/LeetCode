class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board, 0, ans);
        return ans;
    }
    
    static void queen(char[][] board, int row, List<List<String>> list){
        if(row == board.length){
            list.add(construct(board));
            return;
        }
        
        for(int col=0; col<board.length;col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                queen(board, row+1, list);
                board[row][col] = '.';
            }
        }
        
    }
    
     static List<String> construct(char[][] board) {  //constructing list for each solution

        List<String> ansList = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            ansList.add(row);
        }
        return ansList;
    }
    
    static boolean isSafe(char[][] board, int row, int col){
        for(int i=0; i<row;i++){   //vertical
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        
        int maxLeft = Math.min(row, col);  //left diagonal
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i] == 'Q'){
                return false;
            } 
        }
        
        int maxRight = Math.min(row, board.length - 1 - col);    //right diagonal
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i] == 'Q'){
                return false;
            }
        }
        
        return true;
    }
}