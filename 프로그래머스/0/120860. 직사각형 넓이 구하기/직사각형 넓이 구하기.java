import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for(int[] dot : dots) {
            int x = dot[0];
            int y = dot[1];
            
            maxX = Math.max(maxX, x);
            minX = Math.min(minX, x);
            maxY = Math.max(maxY, y);
            minY = Math.min(minY, y);
        }
        answer = (maxX - minX) *  (maxY - minY);
        return answer;
    }
}