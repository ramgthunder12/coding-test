class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i = 0; (i * q) + r < code.length(); i++) {
            answer = answer + code.charAt(q * i + r);
        }
        return answer;
    }
}