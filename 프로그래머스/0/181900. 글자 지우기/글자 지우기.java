import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int[] indices) {
        char[] my_char = my_string.toCharArray();
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            my_char[idx] = '0';
        }
        
        for(char c : my_char) {
            if(c != '0') {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}