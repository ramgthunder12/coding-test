class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] answer = new int[len];
        int[] sum = new int[len];
        
        for(int i = 0; i < len; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        for(int i = 0; i < len; i++) {
            int rank = 1;
            for(int j = 0; j < len; j++) {
                if(sum[i] < sum[j]) {
                    rank++;
                }            
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}