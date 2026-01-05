import java.lang.Math;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        //차가 가장 작은 수 
        int min = 100;
        for(int i : array) {
            if(min > Math.abs(n - i)) {
                min = Math.abs(n - i);
                answer = i;
            } else if(min == Math.abs(n - i)) {
                if(answer > i) {
                    answer = i;
                }
            }
        }
        return answer;
    }
}