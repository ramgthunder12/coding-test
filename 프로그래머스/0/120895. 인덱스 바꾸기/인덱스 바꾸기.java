class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char num1Char = my_string.charAt(num1);
        char num2Char = my_string.charAt(num2);
        
        String answer = my_string.substring(0, num1);
        answer = answer + num2Char;

        answer = answer + my_string.substring(num1 + 1, num2);
        answer = answer + num1Char;
        
        answer = answer + my_string.substring(num2 + 1, my_string.length());

        return answer;
    }
}