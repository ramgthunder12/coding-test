class Solution {
    public int solution(int[][] board) {
        int bLen = board.length;
        int answer = bLen * bLen;
        int[][] tempBoard = new int[bLen][bLen];
        
        for(int i = 0; i < bLen; i++) {
            for(int j = 0; j < bLen; j++) {
                tempBoard[i][j] = 0;
            }
        }
        
        for(int i = 0; i < bLen; i++) {
            for(int j = 0; j < bLen; j++) {
                if(board[i][j] == 1) {
                    //(i-1)(j-1)    (i-1)(j)    (i-1)(j+1)
                    //i(j-1)        ij          i(j+1)
                    //(i+1)(j-1)    (i+1)(j)    (i+1)(j+1)
                    if(j - 1 >= 0) {
                        tempBoard[i][j - 1] = 1;
                        if(i - 1 >= 0) {
                            tempBoard[i - 1][j - 1] = 1;
                        }
                        if(i + 1 < bLen) {
                            tempBoard[i + 1][j - 1] = 1;
                        }
                    }
                    
                    if(i - 1 >= 0) {
                        tempBoard[i - 1][j] = 1;
                    }
                    if(i + 1 < bLen) {
                        tempBoard[i + 1][j] = 1;
                    }
                    
                    if(j + 1 < bLen) {
                        tempBoard[i][j + 1] = 1;
                        if(i - 1 >= 0) {
                            tempBoard[i - 1][j + 1] = 1;
                        }
                        if(i + 1 < bLen) {
                            tempBoard[i + 1][j + 1] = 1;
                        }
                    }
                    tempBoard[i][j] = 1;
                }
            }
        }
        
        for(int i = 0; i < bLen; i++) {
            for(int j = 0; j < bLen; j++) {
                if(tempBoard[i][j] == 1) {
                    answer--;
                }
            }
        }
        return answer;
    }
}