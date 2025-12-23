import java.lang.StringBuilder;

class Solution {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for(String element : arr) {
            answer.append(element);
        }
        return answer.toString();
    }
}