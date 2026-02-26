class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for(char c : myString.toCharArray()) {
            if(c == 'a') {
                c = 'A';
            } else if('A' < c && c <= 'Z') {
                c = (char)(c + 32);
            }
            answer.append(c);
        }
        return answer.toString();
    }
}