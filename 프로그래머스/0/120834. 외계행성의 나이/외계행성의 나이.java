import java.util.Arrays;

class Solution {
    public String solution(int age) {
        String[] ageString = String.valueOf(age).split("");
        String answer = "";

        for(int i = 0; i < ageString.length; i++) {
            answer = answer + (char)(Integer.parseInt(ageString[i]) + 97);
        }
        
        
        return answer;
    }
}