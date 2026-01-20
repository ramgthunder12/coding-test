class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] line = new int[200];
        for(int i = 0; i < line.length; i++) {
            line[i] = 0;
        }
        
        for(int i = 0; i < lines.length; i++) {
            int start = 100 + lines[i][0];
            int end = 100 + lines[i][1];
            for(int j = start; j < end; j++) {
                line[j] = line[j] + 1;
            }
        }
        
        for(int i = 0; i < line.length; i++) {
            if(line[i] > 1) {
                answer = answer + 1; 
            }
        }
        return answer;
    }
}