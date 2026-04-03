class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr[0].length;
        int column = arr.length;
        int len = 0;
        
        if(row > column) {
            len = row;
        } else {
            len = column;
        }
    
        int[][] answer = new int[len][len];
        
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}