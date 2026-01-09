import java.lang.Math;
class Solution {
    public int solution(int n, int t) {
        // int answer = (int)Math.pow((double)2, (double)t) * n;
        int answer = n << t;
        return answer;
    }
}