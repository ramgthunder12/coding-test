import java.lang.StringBuilder;

class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for(char alpabet : myString.toCharArray()) {
            if(alpabet < 'l') {
                alpabet = 'l';
            }
            answer.append(alpabet);
        }
        return answer.toString();
    }
}