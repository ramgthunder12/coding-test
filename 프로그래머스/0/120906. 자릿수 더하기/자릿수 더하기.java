class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = n + "";
        
        for(char c : nStr.toCharArray()) {
            int num = c - '0';
            answer = answer + num;
        }
        return answer;
    }
}