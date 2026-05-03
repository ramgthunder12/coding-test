class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        int size = Math.max(row, col);
        int[][] answer = new int[size][size];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        // int len = Math.max(arr.length, arr[0].length);
        // int[][] answer = new int[len][len];
        
        // for(int i = 0; i < arr.length; i++) {
        //     System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        // }
        
        return answer;
    }
}
