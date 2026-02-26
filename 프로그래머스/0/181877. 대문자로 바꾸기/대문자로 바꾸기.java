class Solution {
    public String solution(String myString) {
        String answer = "";
        char a = 'a';//97
        char A = 'A';//65
        //97 - 65 = 32;
        for(char c : myString.toCharArray()) {
            if((int)c >= 97) {
               answer = answer + (char)((int)c - ('a' - 'A'));
            } else {
                answer = answer + c;
            }
        }
        return answer;
    }
}