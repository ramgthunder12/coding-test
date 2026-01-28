class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if(A.equals(B)) {
            answer = 0;
            return answer;
        }
        
        String temp = A;
        int len = A.length();
        
        for(int i = 1; i <= len; i++) {
            temp = temp.charAt(len - 1) + temp.substring(0, len - 1);
            if(temp.equals(B)) {
                answer = i;
                return answer;
            }
        }
        answer = -1;
        return answer;
    }
}