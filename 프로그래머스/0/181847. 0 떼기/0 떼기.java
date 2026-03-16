import java.lang.StringBuilder;

class Solution {
    public String solution(String n_str) {
        StringBuilder answer = new StringBuilder();
        boolean flug = true;
        for(int i = 0; i < n_str.length(); i++) {
            if(n_str.charAt(i) == '0' && flug) {
            } else {
                flug = false;
                answer.append(n_str.charAt(i));
            }
        }
        return answer.toString();
    }
}