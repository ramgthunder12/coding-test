class Solution {
    public int solution(int num, int k) {
        String numStr = num + "";
        int answer = numStr.indexOf(k + "");
        if(answer != -1) {
            answer++;
        }
        return answer;
    }
}