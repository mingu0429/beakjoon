class Solution {
    public int solution(int[][] board) {
        
        int cnt = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    if(i != 0){
                        if(board[i - 1][j] != 1){
                            board[i - 1][j] = 2;                               
                        }
                        if(j != 0){
                            if(board[i - 1][j - 1] != 1){
                                board[i - 1][j - 1] = 2;
                            }
                        }
                        if(j != board[0].length - 1){
                            if(board[i - 1][j + 1] != 1){
                                board[i - 1][j + 1] = 2;
                            }        
                        }
                    }
                    if(i != board.length - 1){
                        if(board[i + 1][j] != 1){
                            board[i + 1][j] = 2;
                        }
                        if(j != 0){
                             if(board[i + 1][j - 1] != 1){
                                 board[i + 1][j - 1] = 2;
                             }
                        }
                        if(j != board[0].length - 1){
                            if(board[i + 1][j + 1] != 1){
                                board[i + 1][j + 1] = 2;
                            }
                        }
                    }
                    
                    if(j != board[0].length - 1){
                        if(board[i][j + 1] != 1){
                            board[i][j + 1] = 2;
                        }
                    }
                    if(j != 0){
                        if(board[i][j - 1] != 1){
                            board[i][j - 1] = 2;
                        }
                    }
                }
            }
        }
        
        for(int k = 0; k < board.length; k++){
            for(int l = 0; l < board[0].length; l++){
                if(board[k][l] == 0){
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}