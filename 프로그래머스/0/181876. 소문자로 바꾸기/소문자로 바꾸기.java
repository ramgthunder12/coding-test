class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();//97 65
        for(char c : myString.toCharArray()) {
            if(c < 97) {
                c = (char)((int)c + 32);
            }
            answer.append(c);
        }
        return answer.toString();
    }
}