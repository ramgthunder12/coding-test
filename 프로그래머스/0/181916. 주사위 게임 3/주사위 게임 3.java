import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        //1111 T T T 000 index true, true, true = true
        //1112 T T F 001 index true, true, false = false
        //1122 T F T 010 index true, false, true = false
        //1123 T F F 011 index treu, false, false = false
        //1222 F T T 100 index false, true, true = false
        //1223 F T F 101 index false, true, false = false
        //1233 F F T 110 index false, false, true = false
        //1234 F F F 111 index = false, false, false = false
        
        
        //1122 T F T 010 index true, false, true = false
        //1123 T F F 011 index treu, false, false = false
       
        //이진법?. 
        int[] dices = {a, b, c, d};
        Arrays.sort(dices);
        System.out.println(Arrays.toString(dices));
        if(dices[0] == dices[3]) {
            //1111
            answer = 1111 * dices[0];
        } else if(dices[0] == dices[2]) {
            //1112
            answer = 10 * dices[0] + dices[3];
            answer = answer * answer;
        } else if(dices[1] == dices[3]) {
            //1222
            answer = 10 * dices[3] + dices[0];
            answer = answer * answer;
        } else if(dices[1] == dices[2]) {
            //1223
            answer = dices[0] * dices[3];
        } else if(dices[0] == dices[1] && dices[2] == dices[3]) {
            //1122
            answer = (dices[0] + dices[3]) * Math.abs(dices[0] - dices[3]);
        } else if(dices[0] == dices[1]) {
            //1123
            answer = dices[2] * dices[3];
        } else if(dices[2] == dices[3]) {
            //1233
            answer = dices[0] * dices[1];
        } else {
            answer = dices[0];
        }
        
        return answer;
    }
}