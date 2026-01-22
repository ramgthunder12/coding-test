class Solution {
    public int solution(int[][] board) {
        int bLen = board.length;
        int answer = bLen * bLen;
        boolean[][] answerBoard = new boolean[bLen][bLen];
        //(i-1)(j-1) (i-1)(j) (i-1)(j+1)
        //(i)(j-1) (i)(j) (i)(j+1)
        //(i+1)(j-1) (i+1)(j) (i+1)(j+1)
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for(int i = 0; i < bLen; i++) {
            for(int j = 0; j < bLen; j++) {
                if(board[i][j] == 1) {
                    answerBoard[i][j] = true;
                    for(int d = 0; d < 8; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        
                        if(nx >= 0 && nx < bLen && ny >= 0 && ny < bLen) {
                            answerBoard[nx][ny] = true;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < bLen; i++) {
            for(int j = 0; j < bLen; j++) {
                if(answerBoard[i][j]) {
                    answer--;
                }
            }
        }
        return answer;
    }
}
