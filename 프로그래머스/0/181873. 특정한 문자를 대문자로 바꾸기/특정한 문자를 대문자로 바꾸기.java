class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        if(!my_string.contains(alp)) {
            answer.append(my_string);
        } else {
            for(char c : my_string.toCharArray()) {
                if(alp.charAt(0) == c) {
                    c = (char)(c - 32);
                }
                answer.append(c);
            }
        }
        return answer.toString();
    }
}