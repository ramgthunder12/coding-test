import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        int[] alphbet = new int[26];
        for(int i = 0; i < 26; i++) {
            alphbet[i] = 0;
        }
        
        for(char c : s.toCharArray()) {
            //c를 인덱스로 변경
            alphbet[c - 97] = alphbet[c - 97] + 1;
        }
        
        ArrayList<Character> result = new ArrayList();
        
        for(int i = 0; i < 26; i++) {
            if(alphbet[i] == 1) {
                result.add((char)('a' + i));
            }
        }
        
        Collections.sort(result);
        StringBuilder answer = new StringBuilder();
        for(int j = 0; j < result.size(); j++) {
            answer.append(result.get(j));
        }
        return answer.toString();
    }
}