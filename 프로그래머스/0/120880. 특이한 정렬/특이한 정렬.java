import java.util.Arrays;
import java.lang.Math;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = numlist.clone();
        
        for(int i = 0; i < answer.length - 1; i++) {
            for(int j = 0; j < answer.length - 1 - i; j++) {
                int a = answer[j];
                int b = answer[j + 1];
                System.out.println(a + ":" + b);
                
                int distA = Math.abs(a - n);
                int distB = Math.abs(b - n);
                
                if(distA > distB || (distA == distB && a < b)) {
                    answer[j] = b;
                    answer[j + 1] = a;
                }
            }
            System.out.println();
        }
        return answer;
    }
}