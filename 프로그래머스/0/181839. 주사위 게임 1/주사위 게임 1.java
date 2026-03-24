import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        boolean aOddType = (a % 2 == 0)? false: true;
        boolean bOddType = (b % 2 == 0)? false: true;
        
        if(aOddType && bOddType) {
            answer = (a * a) + (b * b);  
        } else if (aOddType || bOddType) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }    
        return answer;
    }
}