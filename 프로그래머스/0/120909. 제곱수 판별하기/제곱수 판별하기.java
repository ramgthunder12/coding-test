import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 2;
        int root = (int)Math.sqrt(n);
        if(n == root * root) {
            answer = 1;
        }
        // for(int i = 1; i <= 1000000; i++ ) {
        //     if(n == i * i) {
        //         answer = 1;
        //         break;
        //     }
        // }
        return answer;
    }
}